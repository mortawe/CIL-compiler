using System;
using System.Collections.Generic;
using System.Reflection.Emit;

namespace l1.ObjectDefs
{
    public class ArrayObjDef: ObjectDef
    {
        public Type ElemType;
        public ArrayObjDef(Type type, Type elemType) :base(type)
        {
            ElemType = elemType;
            Type = type;
            IsUsed = true;
        }
         public override enmObjectScope Scope => enmObjectScope.Array;

         public override void Load()
         {
             Generator_.Emit(OpCodes.Newarr, ElemType);
         }

         public override void Remove(){}

        public  override  void  Free(){}


    }
}