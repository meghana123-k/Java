class StringDemo {
	static String str1 = "Helloll";
	static String str2 = "";
	static String str3 = "hello";
	public static void main(String... args) {
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str1.length());
		System.out.println(str1.charAt(3));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.equals(str3));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.equalsIgnoreCase(str3));
		String sent = "Hello World";
		for(String s : sent.split(" ")) {
			System.out.println(s);
		}
		String x[] = str3.split("");
		for(String st: x) {
			System.out.println(st);
		}
		// Join
		String new_str = String.join(" ", str1,str3, sent);
		System.out.println(new_str);
		
		// concat
		System.out.println(str1.concat(str3));
		// matches
		System.out.println(str1.matches(str3));
		//contains
		System.out.println(str1.contains(str3));
		// substring
		System.out.println(str1.substring(0, 3));
		System.out.println(str1.substring(3));
		// replace
		System.out.println(str1.replace('l', 'G'));
	}	
}