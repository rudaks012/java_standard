package ch07;

class Outer12 {
    int value = 10; // Outer.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("            value : " + value);
            System.out.println("      this.value : " + this.value);
            System.out.println("Outer.this.value : " + Outer12.this.value);
        }
    }
}

public class InnerEx5 {
    public static void main(String[] args) {
        Outer12 outer = new Outer12();
        Outer12.Inner inner = outer.new Inner();
        inner.method1();
    }
}
