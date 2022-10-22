package ch07;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; //외부 클래스의 private멤버도 접근 가능
        int iiv2 = outerCv;
    }

    static class StaticInner {
        //스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
//        int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        int Iv = 0;
        final int LV = 0; // JDK1.8 부터 final 생략 가
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            //외부 클래스의 지역변수는 final이 붙은 상수만 접근 가능하다.
            int liv3 = Iv;
            int liv4 = LV;
        }

    }
}
