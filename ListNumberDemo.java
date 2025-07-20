import java.util.*;
class ListNumberDemo {
	public static void main(String... args) {
		List<Number> ln = new ArrayList<Number>();
		ln.add(1);
		ln.add(99);
		ln.add(3323.1566);
		ln.add(4444.444);
		System.out.println(ln);
		
		List<Integer> lst = new ArrayList<>();
		for(int i = 10; i <= 15; i++) {
			lst.add(i+1);
		}
		System.out.print(lst+" ");
		System.out.println();

		int x = 2, y = 4;
		for(int i = 0; i < x; i++) {
			lst.remove(i);
		}
		for(int i = y+1; i < lst.size(); i++) {
			lst.remove(i);
		}
		
		System.out.println(lst+" ");
	}
}