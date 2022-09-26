package ch6;

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    Car(int number) {

    }
}

public class CarTest2 {

}
