class StringBuilderDemo {
	public static void main(String... args) {
		String str = "Ace Engineering College ";
		StringBuilder sb = new StringBuilder(str);
		sb.append("Welcomes you");
		System.out.println(sb.length());
		sb.delete(33, 36);
		sb.replace(4, sb.length(), "Academy");
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		sb.setCharAt(1, 'Y');
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		//System.out.println(sb.getChars(1,4,2));
		//System.out.println(sb.toCharArray());
		//System.out.println(sb.toString());
		StringBuilder sbb = new StringBuilder();
		sbb.append("          meghana");
		System.out.println(sbb.length());
		System.out.println(sbb.capacity());
		sbb.trimToSize();
		System.out.println(sbb);
		System.out.println(sbb.capacity());
	}
}