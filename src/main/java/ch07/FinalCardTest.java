package ch07;

class Card2 {
    final String KIND;
    final int NUMBER;
    static int width = 100;
    static int height = 250;

    public Card2(String KIND, int NUMBER) {
        this.KIND = KIND;
        this.NUMBER = NUMBER;
    }

    Card2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);

        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
