using System.Collections.Generic;
using System.Reflection.Emit;

namespace l1.ObjectDefs
{
    public class MethodDef
    {
        public Dictionary<string, ArgObjectDef> Args;
        public MethodBuilder MethodBuilder;
        public string Name;

        public MethodDef(string name, Dictionary<string, ArgObjectDef> args, MethodBuilder methodBuilder)
        {
            Name = name;
            Args = args;
            MethodBuilder = methodBuilder;
        }
    }
}