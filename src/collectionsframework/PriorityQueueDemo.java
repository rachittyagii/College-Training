package collectionsframework;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // PriorityQueue<String> books = new PriorityQueue<>();
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        System.out.println("Priority Queue: " + pq);
        pq.add(20);
        System.out.println("Priority Queue: " + pq);
        pq.add(15);
        System.out.println("Priority Queue: " + pq);
        pq.add(5);
        System.out.println("Priority Queue: " + pq);
        pq.add(25);
        System.out.println("Priority Queue: " + pq);
    }
}
