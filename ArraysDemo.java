import java.util.*;

class ArraysDemo {
	public static void main(String... args) {
		String[] details = {"abc","meghana", "csd", "b-sec"};
		Integer marks[] = {90, 74, 46, 98};
		char grade[] = {'b', 'b', 'a', 'c'};
		Arrays.sort(details);
		Arrays.sort(marks);
		//Arrays.sort(details, 1, 3);
		//Arrays.sort(details, (a, b) -> b.compareTo(a));
		System.out.println(Arrays.binarySearch(marks, 98));

		System.out.println(Arrays.binarySearch(details, "b-sec"));
		int a[] = {1, 2, 3};
		int b[] = {1, 2, 3, 4};
		System.out.println(Arrays.equals(a, b));
		String[][] s1 = {{"1", "2", "3"}, {"1", "2", "3"}};
		String[][] s2 = {{"1", "2", "3"}, {"1", "2", "3"}};
		System.out.println(Arrays.deepEquals(s1, s2));
		System.out.println(Arrays.equals(s1, s2));
		
		List<String> lst = Arrays.asList(details);
		System.out.println(lst);
		List<String> s11 = new ArrayList<String>();
		s11.addAll(Arrays.asList(details));
		s11.add("Data Science");
		System.out.println(s11);
		
	}
}