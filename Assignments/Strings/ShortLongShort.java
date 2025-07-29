class ShortLongShort {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hello";
        int n = s1.length();
        int m = s2.length();
        System.out.println(n > m ? s2+s1+s2 : s1+s2+s1);
    }
}
