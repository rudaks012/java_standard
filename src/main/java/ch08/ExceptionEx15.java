package ch08;

import java.io.File;

public class ExceptionEx15 {
    public static void main(String[] args) {
        // command line으로부터 입력받은 내용을 숫자로 변환한다.
        File f = createFile(args[0]);
        System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
    }

    private static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals("")) {
                throw new Exception("파일이름이 유효하지 않습니다.");
            }
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File f = new File(fileName);
            createNewFile(f);
            return f;
        }
    }

    private static void createNewFile(File f) {
        try {
            f.createNewFile(); // 파일을 생성한다.
        } catch (Exception e) {
        }
    }
}

