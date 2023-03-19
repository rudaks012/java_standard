package ch12;

class Juice {
    String name;
    public Juice(String name) { this.name = name + "Juice"; }
    public String toString() { return name; }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        return new Juice(tmp);
    }
}
public class FruitBoxEx3 {



}
