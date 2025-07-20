class StringPrograms {
	public static void main(String... args) {
		String s1 = "PHP Exercises and ";
		String s2 = "Python Exercises";
		String s3 = s1.concat(s2);
		// concat
		System.out.println("The concatenated String: ");
		// check "and" in a string
		System.out.println(s3.contains("and"));
		// compare two char sequence..
		String s11 = "example.com";
		String s22 = "Example.com";
		System.out.println(s11.equals(s22));
		
		System.out.println(s1.startsWith("PH"));
		System.out.println(s1.endsWith("es"));
		
		// check whether two string objects are equal or not
		System.out.println(s11.matches(s22));
		
		//get char array from string

 		for(char ch : s1.toCharArray()) {
			System.out.println(ch);
		}
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		for(char ch : alpha.toCharArray()) {
			System.out.print(alpha.indexOf(ch)+" ");
		}
		System.out.println();
		//
		String str1 = "the quick brown for jumps over the lazy dog.";
		for(char ch : str1.toCharArray()) {
			if(alpha.indexOf(ch) >= 0) {
				System.out.print(alpha.indexOf(ch)+" ");
			} else {
				continue;
			}
		}
	}
}
