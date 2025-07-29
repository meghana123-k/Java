
class Author {
	String name;
	String email;
	char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
public class Book {
	String name;
	Author author;
	double price;
	int qtyInStock;
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int  getqtyInStock() {
		return qtyInStock;
	}
	public Author getAuthor() {
		return author;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setqtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void printBookDetails() {
		System.out.println("Book Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity in Stock: " + qtyInStock);
		System.out.println(author); // Uses Author's toString method
	}
	public static void main(String[] args) {
		Author author = new Author("James Gosling", "jamesgosling@gmail.com", 'M');
		Book book = new Book("Java", author, 150.0, 1);
		book.printBookDetails();
	}
	
}