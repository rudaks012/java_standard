package ch09;

class Point implements Cloneable {
    int x, y; //cl

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone(); // clone() 은 반드시 예외처리를 해주어야 한다
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3,5);
        Point copy = (Point) original.clone(); // 복제(clone)해서 새로운 인스턴스를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}
