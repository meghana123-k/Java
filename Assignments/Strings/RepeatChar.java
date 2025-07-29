class RepeatChar {
    public static void main(String[] args) {
        String s = "Wipro";
        int n = 3;
        String st = s.substring(n-1, s.length());
        System.out.println(st.repeat(n));
    }
}