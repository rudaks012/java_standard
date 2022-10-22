package ch07;

public class InnerEx2 {
    class InstanceInner2 {
    }

    static class StaticInner2 {
    }

    //인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
    InstanceInner2 iv = new InstanceInner2();
    //static 멤버간에는 서로 직접 접근이 가능하다.
    static StaticInner2 cv = new StaticInner2();

    static void staticMethod2() {
        //스태틱 멤버는 인스턴스 멤버에 직접 접근할 수 없다.
//        InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();

        //굳이 접근 하려면 아래와 같이 객체를 생성해야한다.
//        인스턴스클래스는 외부클래스를 먼저 생성해야한다.
        InnerEx2 outer = new InnerEx2();
        InstanceInner2 obj1 = outer.new InstanceInner2();
    }

    void instanceMethod() {
        //인스턴스메서드에서는 인스턴스 멤버와 스태틱 멤버 모두 접근 가능하다.
        InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();
        //메서드 내에 지역적으로 선언된 내부클래스는 외부에서 접근할 수 없다.
//        LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {
        }
        LocalInner lv = new LocalInner();
    }
}
