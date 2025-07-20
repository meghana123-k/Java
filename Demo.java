class Demo {
	int i = 10;
	//public Demo() {
		//System.out.println("this.i = "+this.i);
	//}
	public Demo(int i) {
		this.i = i;
		System.out.println("this.i = "+this.i);
	}
	
	public static void main(String... args) {
		Demo d1 = new Demo();
		//Demo d2 = new Demo(100);
	}
}