class RemoveStar  {
    public static void main(String[] args) {
        String s = "ab*cd";
        int i = s.indexOf("*");
        System.out.println(s.substring(0, i-1)+s.substring(i+2, s.length()));
    }
}