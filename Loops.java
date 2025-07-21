import java.util.Scanner;

class Loops {
    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        } else if(n == 2 || n == 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i*i <= n; i += 6) {
                if(n % i == 0 || n % (i+2) == 0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        if(isPrime(n)) System.out.println(n+" is a prime.");
        else System.out.println(n+" is not a prime.");

    }    
}
