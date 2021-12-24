using System;

namespace l1.ObjectDefs
{
    public class VarDef
    {
        public string Name;
        public Type Type;

        public VarDef(string name, Type type)
        {
            Name = name;
            Type = type;
        }
    }
}