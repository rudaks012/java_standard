package ch08;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        try {
            method1(); // Exception을 throws하고 있으므로 main()에서는 try-catch로 처리하지 않아도 된다.
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception {
        throw new Exception();
    }
}
