class StringTasks {
	public static void main(String... args) {
		String fullName = "Kothakonda Meghana";
		String name[] = fullName.split(" ");
		
		System.out.println(name.length);
		for(String n : name) {
			System.out.print(n.charAt(0)+" ");
		}
		
	}
}