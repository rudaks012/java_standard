package ch11;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrayListEx2 {

    public static void main(String[] args) {
        final int LIMIT = 10; // 자르고자 하는 글자의 개수

        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ2342345435";
        int length = source.length();

        ArrayList list = new ArrayList(length / LIMIT + 10);// 크기를 약간 여유 있게 잡는다.

//        for (int i = 0; i < length; i += LIMIT) {
//            if (i + LIMIT < length) {
//                list.add(source.substring(i, i + LIMIT));
//            } else {
//                list.add(source.substring(i));
//            }
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        IntStream.range(0, (int) Math.ceil(source.length() / (double) LIMIT))
            .mapToObj(i -> source.substring(i * LIMIT, Math.min((i + 1) * LIMIT, source.length())))
            .forEach(System.out::println);
    }

}
