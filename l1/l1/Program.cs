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
            try
            {
                var input = File.ReadAllText(args[0]);
                var stream = CharStreams.fromString(input);
                var lexer = new L1Lexer(stream);
                ITokenStream tokens = new CommonTokenStream(lexer);
                var parser = new L1Parser(tokens);
                parser.BuildParseTree = true;
                IParseTree tree = parser.program();
                var path = Path.GetFileNameWithoutExtension(args[0]) + ".exe";
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