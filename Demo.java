class Demo {
	int i = 10;
	public Demo() {
		System.out.println("this.i = "+this.i);
	}
	public Demo(int i) {
		this.i = i;
		System.out.println("this.i = "+this.i);
	}
	
	public static void main(String... args) {
		System.out.println(new Demo(100));
		System.out.println(new Demo());
		
		byte x = 127;
		boolean b1= true;
		double d = 1.2D;
		System.out.println(x);
		System.out.println(b1);
		System.out.println(d);
		int a = 10, b = 017, c = 0X1A;
		System.out.println(a + "," + b + "," + c);
		System.out.println("Hello World");
	}
}