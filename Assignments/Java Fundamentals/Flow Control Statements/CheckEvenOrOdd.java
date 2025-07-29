import java.util.*;;
public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer a: ");
        int a = sc.nextInt();
        if(a % 2 == 0) System.out.println("Even Number");
        else System.out.println("Odd number");
        sc.close();
    }
}
