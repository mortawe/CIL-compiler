using System;
using System.IO;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace l1
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            int[] str = {10,10,10,123213,1};
            str[4] = 12020;
            Console.Write(str);

            try
            {
                var input = File.ReadAllText("test");
                Console.WriteLine(input);
                var stream = CharStreams.fromString(input);
                var lexer = new L1Lexer(stream);
                ITokenStream tokens = new CommonTokenStream(lexer);
                var parser = new L1Parser(tokens);
                parser.BuildParseTree = true;
                IParseTree tree = parser.program();
                // Console.Write(tree.ToStringTree());
                var path = "compiled.exe";
                // var moduleName = Path.GetFileNameWithoutExtension(path) + ".exe";
                var moduleName = path;
                var cilGen = new CilGenerator(tree, moduleName);
                cilGen.Generate();
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
        }
    }
}