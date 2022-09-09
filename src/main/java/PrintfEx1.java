public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;    //logn big 10000000000L
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNub = 010; // 8진수 10 , 10진수로는 8
        int hexNum = 0x10; //16진수로는 10 , 10진수로는 16
        int binNum = 0b10; //2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int) c);
        System.out.printf("finger = [%5d]%n", finger);
        System.out.printf("finger = [%-5d]%n", finger);
        System.out.printf("finger = [%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex); // #은 접두사(16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNub, octNub); // 8진수 , 10진수
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("bigNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); //정수 인수의 문자열 표현을 밑수 2의 부호 없는 정수로 반환합니다. 부호 없는 정수 값은 인수에 음수인 경우 인수에 232를 더한 값입니다


    }
}
