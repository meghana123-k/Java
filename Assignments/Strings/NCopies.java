import java.util.Scanner;

class NCopies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String st = s.substring(0, 2);
        System.out.println(st.repeat(n));
    }
}
