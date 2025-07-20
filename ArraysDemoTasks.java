import java.util.*;

class ArraysDemoTasks {
	public static void main(String... args) {
		ArrayList<String> as = new ArrayList<>();
		ArrayList<Integer> ai = new ArrayList<>();
		// inserting
		
		as.add("z");
		as.add("a");
		as.add("1");
		as.add("b");
		
		ai.add(2);
		ai.add(1);
		ai.add(36);
		ai.add(51);
		// sorting
		Collections.sort(as);
		Collections.sort(ai);
		//remove 2nd and 3rd ele
		as.remove(3);
		as.remove(2);
		ai.remove(3);
		ai.remove(2);
		//convert to array
		int a1[] = new int[ai.size()];
		for(int i = 0; i < ai.size(); i++) {
			a1[i] = ai.get(i);
		}
		// remove all ele of string list
		as.clear();
		// check if 2 is there and remove it
		if(ai.contains(2)) {
			ai.remove(Integer.valueOf(2));
		}
		// add the string
		as.add("Apple");
		as.add("Banana");
		ai.add(100);
		ai.add(102);
		System.out.println(as);
		System.out.println(ai);
	}
}