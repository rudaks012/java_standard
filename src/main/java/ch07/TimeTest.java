package ch07;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println("t = " + t);
        t.setHour(13);
        t.setHour(t.getHour() + 1);
        System.out.println("t = " + t);
    }

}
