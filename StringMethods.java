class StringMethods {
	public static void main(String... args) {
		String str = "ACE Engineering College ";
		/*System.out.println("Without RE: "+str.matches("e"));
		System.out.println(str.contains("e"));
		System.out.println("with RE: "+str.matches(".*e.*"));
		System.out.println(str.indent(5));
		System.out.println(str.repeat(3));
		System.out.println("index of "+str.indexOf('e'));
		System.out.println("lastIndexOf "+str.lastIndexOf('e'));*/
		String s = str.replace('e', 'E');
		//System.out.println("replaceAll "+str.replaceAll("l", "L"));
		//System.out.println("replaceFirst "+str.replaceFirst("A", "a"));
	
		/*for(char ch : s.substring(4).toCharArray()) {
			System.out.print(ch+"");
		}
		System.out.println();
		System.out.println(str.indent(5));
		System.out.println(str.indent(5).strip());
		System.out.println(str.indent(5).stripLeading());
		System.out.println(str.indent(5).stripTrailing());
		System.out.println(String.valueOf(4));
		Integer num = 148321;
		String n = num.toString();
		System.out.println(n);
		int n1 = 12345;
		String s1 = String.valueOf(n1);
		System.out.println(s1);*/
		String s1 = "HELLO";
		String s2 = "GDKKN";
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
	}
}