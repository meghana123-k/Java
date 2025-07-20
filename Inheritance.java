import java.util.*;
class A {
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public void mult(int a, int b) {
		System.out.println("Product = "+a*b);
	}
}
class B extends A {
	public double div(int a, int b) {
		System.out.println("Sum = "+super.sum(a, b));
		return a/b;
	}
	// method overriding
	public void mult(int a, int b) {
		System.out.println("Product");
	}
} 

class Inheritance {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		B bb = new B();
		//System.out.println("Sum = "+bb.sum(a, b));
		System.out.println("Sub = "+bb.sub(a, b));
		bb.mult(a, b);
		//System.out.println("Product = "+bb.mult(a, b));
		System.out.println("Division = "+bb.div(a, b));
	}
}