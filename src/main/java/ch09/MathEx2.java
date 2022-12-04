package ch09;

public class MathEx2 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;

        System.out.println("+i = " + +i);
        System.out.println("-i = " + -i);

        try {
            System.out.printf("negateExact(%d) = %d%n", 10, Math.negateExact(10));
            System.out.printf("negateExact(%d) = %d%n", -10, Math.negateExact(-10));
            System.out.printf("negateExact(%d) = %d%n", Integer.MIN_VALUE, Math.negateExact(Integer.MIN_VALUE));
        } catch (ArithmeticException e) {
            //i를 long타입으로 형변환 다음에 negateExact()를 호출해야 한다.
            System.out.printf("negateExact(%d) = %d%n", (long) Integer.MIN_VALUE, Math.negateExact((long) Integer.MIN_VALUE));
        }
    }
}
