import java.util.Scanner;

class HalfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var = sc.nextLine();
        int n = var.length();
        String s = null;
        if(n % 2 != 0) {
            System.out.println(s);
        } else {
            System.out.println(var.substring(0, n/2));
        }
    }
}