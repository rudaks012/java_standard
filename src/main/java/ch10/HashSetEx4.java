package ch10;

import ch10.HashSetEx3.Person;
import java.util.HashSet;
import java.util.Objects;

public class HashSetEx4 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 10));

        System.out.println("set = " + set);
    }

    static class Person2 {
        String name;
        int age;

        public Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // equals()와 hashCode()를 오버라이딩 하지 않으면
        // 같은 내용의 객체라도 다른 객체로 인식한다.
        // 그래서 HashSet에 중복된 객체가 저장된다.
        // equals()와 hashCode()를 오버라이딩 하면
        // 같은 내용의 객체라면 같은 객체로 인식한다.
        // 그래서 HashSet에 중복된 객체가 저장되지 않는다.
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person2 person2 = (Person2) o;
            return age == person2.age && Objects.equals(name, person2.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        public String toString() {
            return name + ":" + age;
        }
    }

}
