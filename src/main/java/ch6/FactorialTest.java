package ch6;

public class FactorialTest {

    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    private static int factorial(int i) {
        if (i <= 0 || i > 12) {
            return -1;
        }
        if (i == 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
