package Assignments.OOPS_Inheritance.Classes_Objects;
class Author {
	String name;
	String email;
	char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		System.out.println(name+" "+" "+email+" "+gender);
	}
	public static void main(String... args) {
		Author at = new Author("Meghana", "kothakondameghana3@gmail.com", 'F');
		
	}
}