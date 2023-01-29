package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3); // pq.offer(new Integer(3)); 오토박싱
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);

        Object obj = null;
        //PriorityQueue는 저장된 요소를 꺼낼 때 우선순위가 가장 높은 것부터 꺼낸다.
        while((obj = pq.poll()) != null) {
            System.out.println(obj);
        }
    }


}
