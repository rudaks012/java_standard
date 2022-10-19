package ch07;

interface Parseable {
    public abstract void parse(String fileName);
}

class ParserManager {
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
        }
    }

    private static class XMLParser implements Parseable {
        public void parse(String fileName) {
            System.out.println(fileName + "- XML parsing completed.");
        }
    }

    private static class HTMLParser implements Parseable {
        public void parse(String fileName) {
            // HTML parsing
            System.out.println(fileName + "- HTML parsing completed.");
        }
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
