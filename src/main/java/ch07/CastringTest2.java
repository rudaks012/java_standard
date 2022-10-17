package ch07;

public class CastringTest2 {
    public static void main(String[] args) {
        Car car = new FireEngine();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car; // 컴파일은 된다 실행시 에러 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
