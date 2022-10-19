package ch07;

public class RepairableTest {
    public static void main(String[] args) {
        Tank1 tank = new Tank1();
        Dropship2 dropship2 = new Dropship2();

        Marine2 marine = new Marine2();
        SCV2 scv2 = new SCV2();

        scv2.repair(tank);
        scv2.repair(dropship2);
//        scv2.repair(marine);


    }
}

interface Repairable {
}

class Unit2 {
    int hitPoint;
    final int MAX_HP;

    Unit2(int max_hp) {
        MAX_HP = max_hp;
    }
}

class GroundUnit extends Unit2 {

    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit2 {

    AirUnit(int hp) {
        super(hp);
    }
}

class Tank1 extends GroundUnit implements Repairable {

    Tank1() {
        super(150); // Tank 의 HP는 150 이다.
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class Dropship2 extends AirUnit implements Repairable {

    Dropship2() {
        super(125);
        hitPoint = MAX_HP;
    }
}

class Marine2 extends GroundUnit {

    Marine2() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV2 extends GroundUnit implements Repairable {
    SCV2() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit2) { //연산자로 타입체크를 한 뒤 캐스팅하여 unit클래스에 정의된 변수를 사용함
            Unit2 u = (Unit2) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
}
