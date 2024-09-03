package Queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {

    public static void main(String[] args) {

        // assending order
       // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // desending order
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(2);
        pq.add(4);
        pq.add(3);
        pq.add(1);
        pq.add(5);
        pq.add(62);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();

        }

    }

}
