package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListLinkedListTest2 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);


        System.out.println("= 접근시간테스트 =");
        System.out.println("ArrayList : " + access(al));
        System.out.println("LinkedList : " + access(ll));

    }

    private static long access(List al) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < al.size(); i++) {
            al.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;

    }

    public static void add(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(i + "");
        }
        IntStream.range(0, 100000).forEach(list::add);
    }


}
