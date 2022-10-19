package ch07;

class A {
    public void autoPlay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B implements I {
    public void play() {
        System.out.println("play int B class");
    }
}
class C implements I {
    public void play() {
        System.out.println("play int C class");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}
