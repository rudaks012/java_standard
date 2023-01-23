package ch6;

public class PrimitiveParamEx {

    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("d.x = " + d.x);

        change(d);
        System.out.println("After change(d,x)");
        System.out.println("main() : x = " + d.x);
    }

    private static void change(Data d) {
        d.x = 1000;
        System.out.println("change = " + d.x);
    }

}
