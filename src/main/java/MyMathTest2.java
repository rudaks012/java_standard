public class MyMathTest2 {

    public static void main(String[] args) {
        //클래스 메서드 호출 인스턴스 생성 없이 호출 가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200.0, 100.0));

        MyMath2 myMath2 = new MyMath2(); // 인스턴스를 생성
        myMath2.a = 200L;
        myMath2.b = 100L;

        System.out.println(myMath2.add());
        System.out.println(myMath2.subtract());
        System.out.println(myMath2.multiply());
        System.out.println(myMath2.divide());
    }

}
