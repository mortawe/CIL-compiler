using System;
using System.Collections.Generic;
using System.Reflection.Emit;

namespace l1.ObjectDefs
{
    public class LocalObjectDef : ObjectDef
    {
        private static List<LocalObjectDef> _locals;

        protected List<LocalObjectDef> DuplicatedLocals = new List<LocalObjectDef>();
        public string Name;

        public int Number;
        public Type ElemType;

        protected LocalObjectDef(Type type, int number, string name = "", Type elemType = null)
            : base(type)
        {
            ElemType = elemType;
            Name = name;
            Number = number;
        }

        public override enmObjectScope Scope => enmObjectScope.Local;

        public static LocalObjectDef AllocateFromObjectDef(ObjectDef obj, string name = "")
        {
            if (obj is ValueObjectDef)
            {
                var arr = (ValueObjectDef) obj;
                return AllocateLocal(arr.Type, name, arr.ElemType);
            }

            if (obj is LocalObjectDef)
            {
                var l = (LocalObjectDef) obj;
                return AllocateLocal(l.Type, name, l.ElemType);
            }

            return AllocateLocal(obj.Type, name);
        }
        public static LocalObjectDef AllocateLocal(Type type, string name = "", Type ElemType = null)
        {
            if (type.IsArray)
            {
                ElemType = type.GetElementType();
            }
            var duplicatedLocals = new List<LocalObjectDef>();
            var number = 0;
            int i;
            for (i = 0; i < _locals.Count; i++)
                if (_locals[i].Scope == enmObjectScope.Local && _locals[i].Name == name && name != "")
                {
                    duplicatedLocals.Add(_locals[i]);
                    _locals[i].IsUsed = false;
                }

            for (i = 0; i < _locals.Count; i++)
                if (_locals[i].Type.Name == type.Name && !_locals[i].IsUsed)
                {
                    number = i;
                    _locals[i] = new LocalObjectDef(type, number, name, ElemType);
                    break;
                }

            if (i == _locals.Count)
            {
                var localVar = Generator_.DeclareLocal(type);
                number = localVar.LocalIndex;
                _locals.Add(new LocalObjectDef(type, number, name, ElemType));
            }

            EmitSaveToLocal(number);
            return _locals[number];
        }

        public override void Load()
        {
            EmitLoadFromLocal(Number);
        }

        public override void Remove()
        {
            if (Name == "")
                IsUsed = false;
        }

        public override void Free()
        {
            for (var i = 0; i < DuplicatedLocals.Count; i++)
            {
                _locals[DuplicatedLocals[i].Number] = DuplicatedLocals[i];
                _locals[DuplicatedLocals[i].Number].IsUsed = true;
            }

            IsUsed = false;
        }

        public static void InitGenerator(ILGenerator generator)
        {
            Generator_ = generator;
            _locals = new List<LocalObjectDef>();
        }

        public static LocalObjectDef GetLocalObjectDef(string Name)
        {
            for (var i = 0; i < _locals.Count; i++)
                if (_locals[i].IsUsed && _locals[i].Name == Name)
                    return _locals[i];
            return null;
        }
    }
}