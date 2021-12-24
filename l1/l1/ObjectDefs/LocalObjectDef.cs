using System;
using System.Collections.Generic;
using System.Reflection.Emit;

namespace l1.ObjectDefs
{
    public class LocalObjectDef : ObjectDef
    {
        protected static List<LocalObjectDef> Locals_;

        protected List<LocalObjectDef> DuplicatedLocals = new List<LocalObjectDef>();
        public string Name;

        public int Number;

        protected LocalObjectDef(Type type, int number, string name = "")
            : base(type)
        {
            Name = name;
            Number = number;
        }

        public override enmObjectScope Scope => enmObjectScope.Local;

        public static LocalObjectDef AllocateLocal(Type type, string name = "")
        {
            var duplicatedLocals = new List<LocalObjectDef>();
            var number = 0;
            int i;
            for (i = 0; i < Locals_.Count; i++)
                if (Locals_[i].Scope == enmObjectScope.Local && Locals_[i].Name == name && name != "")
                {
                    duplicatedLocals.Add(Locals_[i]);
                    Locals_[i].IsUsed = false;
                }

            for (i = 0; i < Locals_.Count; i++)
                if (Locals_[i].Type.Name == type.Name && !Locals_[i].IsUsed)
                {
                    number = i;
                    Locals_[i] = new LocalObjectDef(type, number, name);
                    break;
                }

            if (i == Locals_.Count)
            {
                var localVar = Generator_.DeclareLocal(type);
                number = localVar.LocalIndex;
                Locals_.Add(new LocalObjectDef(type, number, name));
            }

            EmitSaveToLocal(number);
            return Locals_[number];
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
                Locals_[DuplicatedLocals[i].Number] = DuplicatedLocals[i];
                Locals_[DuplicatedLocals[i].Number].IsUsed = true;
            }

            IsUsed = false;
        }

        public static void InitGenerator(ILGenerator generator)
        {
            Generator_ = generator;
            Locals_ = new List<LocalObjectDef>();
        }

        public static LocalObjectDef GetLocalObjectDef(string Name)
        {
            for (var i = 0; i < Locals_.Count; i++)
                if (Locals_[i].IsUsed && Locals_[i].Name == Name)
                    return Locals_[i];
            return null;
        }
    }
}