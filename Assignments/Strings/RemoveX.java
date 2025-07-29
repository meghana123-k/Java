class RemoveX {
    public static void main(String[] args) {
        String s = "xHix";
        if(s.charAt(0) == 'x' || s.charAt(s.length()-1) == 'x') {
            System.out.println(s.replaceAll("x", ""));
        } else {
            System.out.println(s);
        }
    }    
}
