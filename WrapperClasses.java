class WrapperClasses {
	public static void main(String... args) {
		int a = 10;
		Integer x = 20;
		System.out.println("a = "+a+" x = "+x);
		System.out.println(x.MAX_VALUE);
		int n = x; // auto unboxing -> Implicitly converts Integer to int
		System.out.println(n);
		int num = x.intValue(); // manual unboxing -> explicitly calling intValue() method.
		System.out.println(num);
		//x = a;
		//System.out.println(x.hashCode());
		
		//System.out.println(x.isDigit());
		
	}
}