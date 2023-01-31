package ch10;

import java.util.TreeSet;
import java.util.stream.IntStream;

public class TreeSetEx2 {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

//        IntStream.range(0, score.length)
//                 .forEach(i -> set.add(score[i]));

        IntStream.of(score)
                 .forEach(set::add);
        System.out.println("50보다 작은 값 : " + set.headSet(50));
        System.out.println("50보다 큰 값 : " + set.tailSet(50));
    }

}
