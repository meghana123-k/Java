interface Interface {
	abstract public void meth1(int a);
	abstract public void meth2(int x, int y);
}
abstract class InterfaceDemo implements Interface {
	public void meth1(int a){
		System.out.println("Hiii!!");
	}
	public void meth2(){}
	public static void main(String... args) {
		//meth1();
	}
}
