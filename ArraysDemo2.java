import java.util.*;

class ArraysDemo2 {
	public static void main(String... args) {
		int[] a = {91, 22, 33, 65, 76, 9};
		Arrays.fill(a, 11);
		for(int ele:a) {
			System.out.print(ele+" ");
		}
		System.out.println();
		int[] b = Arrays.copyOf(a, 6);
		for(int ele:b) {
			System.out.print(ele+" ");
		}
		System.out.println();
		int[] c = Arrays.copyOfRange(a, 0, 2);
		for(int ele:c) {
			System.out.print(ele+" ");
		}
		// Sorting
		
		Arrays.sort(a);
		if(Arrays.binarySearch(a, 65) >= 0 && Arrays.binarySearch(a, 77) >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}