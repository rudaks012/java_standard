package ch6;



public class CarTest2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        System.out.println(
            "c2.color ,c2.door,c2.gearType = " + c2.color + "+" + c2.door + "+" + c2.gearType);
        System.out.println(
            "c1.color ,c1.door,c1.gearType = " + c1.color + "+" + c1.door + "+" + c1.gearType);
    }
}
