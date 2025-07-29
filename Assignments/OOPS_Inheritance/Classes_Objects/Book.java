class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		//System.out.println(name+" "+" "+email+" "+gender);
	}
}

class Book {
	String bookName;
	String AuthName;
	int qtyInStock;
	double price;
	
	public Book(String bookName, String AuthName, double price, int qtyInStock) {
		this.bookName = bookName;
		this.AuthName = AuthName;
		this.qtyInStock = qtyInStock;
		this.price = price;
	}
	void getter() {
		System.out.println("Book Name: "+bookName+"\n"+"Author Name:"+AuthName+"\n"+"Price: "+price+"\n"+"Quantiy: "+qtyInStock);
	}
	public static void main(String... args) {
		Author at = new Author("Meghana", "kothakondameghana3@gmail.com", 'F');
		Book b1 = new Book("Java", at.name, 150, 50);
		b1.getter();
	}
}