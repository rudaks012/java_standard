package ch11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HaseSetEx1 {

    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();
        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]); // Set에 objArr[i]를 추가한다.
        }
        System.out.println(set);

        // HashSet의 저장 순서를 알고 싶다면 LinkedHashSet을 사용하면 된다.
        // Set set = new LinkedHashSet();
        // set.addAll(Arrays.asList(objArr));
        // System.out.println(set);

//        Set set2 = Arrays.stream(objArr).collect(Collectors.toSet());
        //collect(Collectors.toSet())은 중복을 허용하지 않는다. -> 배열을 Set으로 변환
//        System.out.println(set2);
    }
}

