package ch09;

public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        //fullName에서 '.'의 위치를 찾는다.
        int index = fullName.indexOf('.');
        //fullName에서 처음부터 '.'까지 문자열을 추출한다.
        String fileName = fullName.substring(0, index);

        //fullName에서 '.'의 다음 문자부터 끝까지 문자열을 추출한다.
        String ext = fullName.substring(index + 1);

        System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
        System.out.println(fullName + "의 확장자는 " + ext);
    }
}