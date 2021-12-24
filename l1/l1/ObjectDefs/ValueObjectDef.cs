using System;
using System.Globalization;
using System.Reflection.Emit;

namespace l1.ObjectDefs
{
    public class ValueObjectDef : ObjectDef
    {
        private readonly ConstructorBuilder Builder;
        private readonly object Value;
        public Type ElemType;

        public ValueObjectDef(Type type,  Type elemType): base(type)
        {
                ElemType = elemType;
                Type = type;
                IsUsed = true;
        }
        
        public ValueObjectDef(Type type, object value = null, Type elemType = null)
            : base(type)
        {
            if (type.IsArray)
            {
                ElemType = type.GetElementType();
                Type = type;
                IsUsed = true;
                return;
            }
            Value = value;
            if (value == null)
            {
                if (type == typeof(int))
                {
                    Value = 0;
                }
                else if (type == typeof(bool))
                {
                    Value = false;
                }
                else if (type == typeof(char))
                {
                    Value = '\t';
                }
                else if (type == typeof(string))
                {
                    Value = "";
                }
                else
                {
                    Value = null;
                }
            }
        }

        public override enmObjectScope Scope => enmObjectScope.Value;

        public override void Load()
        {
            if (Type == typeof(int) || Type == typeof(Int32))
            {
                EmitInteger((int) Value);
            }
            else if (Type == typeof(bool) || Type == typeof(Boolean))
            {
                var boolean = (bool) Value;
                if (boolean)
                    Generator_.Emit(OpCodes.Ldc_I4_1);
                else
                    Generator_.Emit(OpCodes.Ldc_I4_0);
            }
            else if (Type == typeof(char))
            {
                EmitInteger( (int) (char) Value);
            } 
            else if (Type == typeof(string))
            {
                Generator_.Emit(OpCodes.Ldstr, (string) Value);
            }
            else if (Type.IsArray)
            {
                Generator_.Emit(OpCodes.Newarr, ElemType);
            }
        }


        public override void Remove()
        {
        }

        public override void Free()
        {
        }
    }
}