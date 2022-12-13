package ch09;

import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d!-%s%n", i, calcFactorial(i));

        }
    }

    private static String calcFactorial(int i) {
        return factorial(BigInteger.valueOf(i)).toString();
    }

    private static BigInteger factorial(BigInteger n) {
        if (n.equals((BigInteger.ZERO))) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
