import java.util.*;
class CollectionsDemo {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
		System.out.println("Enter no. of test cases ");
		int t1 = sc.nextInt();
		for(int j = 0; j < t1; j++) {
			System.out.println("Enter no. of elements ");
			int n = sc.nextInt();
			ArrayList<Integer> br = new ArrayList<>();
			System.out.println("Enter elements");
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				br.add(x);
			}
			ar.add(br);
		}
		System.out.println("Enter no. of test cases of queries ");
		int t2 = sc.nextInt();
		System.out.println("Enter test cases ");
		
		for(int i = 0; i < at1.size(); i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x-1 < t1 && y-1 < ar.get(x-1).size()) {
				System.out.println("Result = "+ar.get(x-1).get(y-1));
			} else {
				System.out.println("Error!!");
			}
		}
	}
}