abstract class AbstractParent {
	abstract public void meth1(int a);
	abstract public void meth2(int a, int b);
	public static void concrete() {
		System.out.println("Concrete Method");
	}
	
}
abstract class AbstractDemo extends AbstractParent {
	// overriding
	public void meth1(int a){}
	public void meth2(int a, int b){}
}
class AbstractClass {
	public static void main(String... args) {
		System.out.println("Main Method");
	}
}