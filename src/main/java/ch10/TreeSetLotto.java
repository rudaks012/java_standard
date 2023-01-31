package ch10;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class TreeSetLotto {

    public static void main(String[] args) {
        Set set = new TreeSet();
        // 정렬하는 순서가 빠진 이유는 TreeSet은 저장할때 이미 정렬을 하기 때문이다.
//        for (int i = 0; set.size() < 6; i++) {
//            int num = (int) (Math.random() * 45) + 1;
//            set.add(num); // set에 num을 저장한다.
//        }
        IntStream.generate(() -> (int) (Math.random() * 45 + 1))
                 .distinct()
                 .limit(6)
                 .forEach(set::add);

        System.out.println(set);


    }

}
