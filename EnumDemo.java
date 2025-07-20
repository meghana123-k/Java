import java.util.*;
enum Brands {
	Apple,
	Dell,
	Lenovo,
	Hp,
	Acer;
	public int enumMethod(String bname){
		switch(bname) {
			case "Apple": return 1;
			case "Dell" : return 2;
			case "Lenovo" : return 3;
			case "Hp" : return 4;
			case "Acer" : return 5;
			default : return 0;
		}
	}
}
class EnumDemo {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String bname = sc.next();
		//System.out.println(Brands.Dell);
		System.out.println(Brands.Dell.enumMethod(bname));
	}
}