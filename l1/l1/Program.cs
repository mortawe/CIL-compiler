using System;
using System.Text;
using Antlr4.Runtime;

namespace l1
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            try
            {
                var input = "";
                var text = new StringBuilder();
                Console.WriteLine("Input the chat.");

                // to type the EOF character and end the input: use CTRL+D, then press <enter>
                while ((input = Console.ReadLine()) != null) text.AppendLine(input);

                var inputStream = new AntlrInputStream(text.ToString());
                var speakLexer = new SpeakLexer(inputStream);
                var commonTokenStream = new CommonTokenStream(speakLexer);

                var speakParser = new SpeakParser(commonTokenStream);
                var chatContext = speakParser.chat();
                var visitor = new SpeakVisitor();
                visitor.Visit(chatContext);
                var tokens = commonTokenStream.GetTokens();
                foreach (var t in tokens)
                {
                    Console.WriteLine("{0} type, {1} text" , t.Type, t.Text);
                }
                foreach (var line in visitor.Lines) Console.WriteLine("{0} has said {1}", line.Person, line.Text);
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
        }
    }
}