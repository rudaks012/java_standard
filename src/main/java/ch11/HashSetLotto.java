package ch11;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HashSetLotto {

    public static void main(String[] args) {
//        Set set = new HashSet();

//        for (int i = 0; set.size() < 6; i++) {
//            int num = (int) (Math.random() * 45) + 1;
//            set.add(num);
//        }
//        List list = new LinkedList(set); //LinkedList(Collection c)
//        Collections.sort(list); // 정렬
//        System.out.println(list);

        //generate()는 무한 순차 비정렬 스트림을 반환
        //generate()는 람다식을 이용해서 값을 생성한다.
        //limit()는 생성할 개수를 제한한다.
        //sorted()는 정렬한다.
        //collect()는 스트림을 컬렉션으로 변환한다.
        List<Integer> list = IntStream.generate(() -> (int) (Math.random() * 45) + 1)
                                      .distinct()
                                      .limit(6)
                                      .boxed().sorted()
                                      .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(list);

    }


}
