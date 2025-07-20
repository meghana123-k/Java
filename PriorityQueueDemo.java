import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    PriorityQueue<Integer> pq2 = new PriorityQueue<>();
    for (int i = 5; i >= 0; i--) {
      pq1.add(i*10);
    }
    for (int i = 10; i >= 0; i--) {
      pq2.add(i);
    }
    System.out.println("Priority Queue - 1: "+pq1);
    System.out.println("Priority Queue - 2: "+pq2);
    // using while
    System.out.println("Using While loop");
    while (!pq2.isEmpty()) {
      System.out.print(pq2.remove()+" ");
    }
    // using for iterator
    System.out.println("\nUsing Iterator");
    Iterator<Integer> it = pq1.iterator();
    while (it.hasNext()) {
      System.out.print(it.next()+" ");
    }
    System.out.println();
    System.out.println(pq1.size());
  }
}