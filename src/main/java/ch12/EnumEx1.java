package ch12;

public class EnumEx1 {

    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1 == d2 ? " + (d1 == d2));
        System.out.println("d1 == d3 ? " + (d1 == d3));

        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
        System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));

        switch (d1) {
            case EAST: //Direction.EAST와 같은 의미
                System.out.println("The direction is EAST");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH");
                break;
            case WEST:
                System.out.println("The direction is WEST");
                break;
            case NORTH:
                System.out.println("The direction is NORTH");
                break;
            default:
                System.out.println("Invalid direction");
                break;
        }

        //Direction.values()는 Direction에 정의된 모든 열거 상수를 배열로 반환
        //밑에 부분은 반복문을 돌려면 위치를 찾아준다
        Direction[] dArr = Direction.values();
        for (Direction d : dArr) {
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
        }
    }
}
