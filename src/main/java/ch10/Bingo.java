package ch10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bingo {

//    public static void main(String[] args) {
//        Set set = new HashSet();
////        Set set = new LinkedHashSet();
//        int[][] board = new int[5][5];
//
//        for (int i = 0; i < set.size(); i++) {
//            set.add((int) (Math.random() * 50) + 1 + "");
//        }
//
//
//        Iterator it = set.iterator();
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                board[i][j] = (int) it.next();
//                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        int size = 25;
        Set<String> set = IntStream.range(0, size)
                                   .mapToObj(i -> (int) (Math.random() * 50) + 1 + "")
                                   .collect(Collectors.toSet());

        int[][] board = new int[5][5];
        int index = 0;
        for (int i = 0; i <= board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt(set.toArray()[index++].toString());
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
    }
}
