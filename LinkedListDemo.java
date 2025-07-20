import java.util.*;

public class LinkedListDemo {

  public static void main(String... args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    
    list.offer(40);
    list.addLast(60);
    System.out.println("using iterator\n");
    Iterator<Integer> it = list.iterator();
    while (it.hasNext()) {
      System.out.print(it.next()+" ");
    }
    list.add(3, 50);
    System.out.println();
    System.out.println("using descending iterator\n");
    Iterator<Integer> it1 = list.descendingIterator();
    while (it1.hasNext()) {
      System.out.print(it1.next()+" ");
    }
    System.out.println();
    System.out.println("using for each\n");
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(11);
    ll.add(22);
    ll.add(33);
    list.addAll(2, ll);
    list.forEach(lst -> System.out.print(lst+" "));
    LinkedList<Integer> l2 = new LinkedList<>();
    
  }
}