import java.util.Scanner;

public class CheckNumber2 {
    public static boolean lastDigit(int a, int b) {
        return a == (b % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lastDigit(a, b));
        sc.close();
    }
}