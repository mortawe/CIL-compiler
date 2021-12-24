using System;
using System.Reflection.Emit;

namespace l1.ObjectDefs
{
    public class ArgObjectDef : ObjectDef
    {
        public string Name;
        public int Number;

        public ArgObjectDef(Type type, int number, string name) : base(type)
        {
            Number = number;
            Name = name;
        }

        public override enmObjectScope Scope => enmObjectScope.Argument;

        public override void Load()
        {
            switch (Number)
            {
                case 0:
                    Generator_.Emit(OpCodes.Ldarg_0);
                    break;
                case 1:
                    Generator_.Emit(OpCodes.Ldarg_1);
                    break;
                case 2:
                    Generator_.Emit(OpCodes.Ldarg_2);
                    break;
                case 3:
                    Generator_.Emit(OpCodes.Ldarg_3);
                    break;
                default:
                    if (Number < 256)
                        Generator_.Emit(OpCodes.Ldarg_S, Number);
                    else
                        Generator_.Emit(OpCodes.Ldarg, Number);
                    break;
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