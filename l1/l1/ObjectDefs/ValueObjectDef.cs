using System;
using System.Globalization;
using System.Reflection.Emit;

namespace l1.ObjectDefs
{
    public class ValueObjectDef : ObjectDef
    {
        private readonly ConstructorBuilder Builder;
        private readonly object Value;

        public ValueObjectDef(Type type, object value = null, ConstructorBuilder builder = null)
            : base(type)
        {
            Value = value;
            if (value == null)
            {
                if (type == typeof(int))
                {
                    Value = 1;
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
        

            Builder = builder;
        }

        public override enmObjectScope Scope => enmObjectScope.Value;

        public override void Load()
        {
            if (Type == typeof(int))
            {
                EmitInteger((int) Value);
            }
            else if (Type == typeof(bool))
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
            else if (Builder == null)
            {
                Generator_.Emit(OpCodes.Ldnull);
            }
            else
            {
                Generator_.Emit(OpCodes.Newobj, Builder);
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