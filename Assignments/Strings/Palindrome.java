public class Palindrome {
    public static void main(String[] args) {
        String s = "adbda";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb.toString().equals(s) ? "Yes" : "No");
    }
}
