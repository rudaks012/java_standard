package ch6;

public class Product {
    static int count = 0; // 생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo;   // 인스턴스의 고유 번호
    {
        ++count;            //Product인스턴스가 생성될때마다 count의 값을 1씩 증가 -> serialNo에 저장
        serialNo = count;
    }
    public Product() {

    }


}
