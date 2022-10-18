package ch07;

import java.util.Vector;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
    }

    Product() {
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 구입한 제품을 저장하기 위한 객체배열
//    Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
//    int i = 0; // Product배열에 사용될 카운터

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
//        item[i++] = p; // 제품을 Product[] item에 저장
        item.add(p); // 제품을 Vector에 저장
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = ""; // 구입한 물품목록

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }

//    void summary() {
//        int sum = 0; // 구입한 물품의 가격합계
//        String itemList = ""; // 구입한 물품목록
//
//        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
//        for (int i = 0; i < item.length; i++) {
//            if (item[i] == null) {
//                break;
//            }
//            sum += item[i].price;
//            itemList += item[i] + ", ";
//        }
//        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
//        System.out.println("구입하신 제품은 " + itemList + "입니다.");
//    }
}


public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv1 tv = new Tv1();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }

}
