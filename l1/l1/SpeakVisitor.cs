using System.Collections.Generic;

namespace l1
{
    public class SpeakLine
    {
        public string Person { get; set; }
        public string Text { get; set; }
    }

    public class SpeakVisitor : SpeakBaseVisitor<SpeakLine>
    {
        public List<SpeakLine> Lines = new List<SpeakLine>();

        public override SpeakLine VisitLine(SpeakParser.LineContext context)
        {
            var name = context.name();
            var opinion = context.opinion();
            var line = new SpeakLine() { Person = name.GetText(), Text = opinion.GetText().Trim('"') };

            Lines.Add(line);

            return line;
        }
    }
}