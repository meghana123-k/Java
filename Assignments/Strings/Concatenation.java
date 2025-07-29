import java.util.Scanner;

class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        if(s1.charAt(s1.length()-1) == s2.charAt(0)) {
            String s_new = s1.substring(0, s1.length()) + s2.substring(1, s2.length());
            System.out.println(s_new);
        } else {
            String s_new = s1 + " "+ s2;
            System.out.println(s_new);
        }
    }
}