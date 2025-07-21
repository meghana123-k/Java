class ControlFlow {
    public static void main(String[] args) {
        if (args.length >= 2) {            
            System.out.println(args[0]+","+args[1]);
        } else {
            System.out.println("No Values");
        }
        char c = 'e';
        if(Character.isDigit(c)) System.out.println("Digit");
        else if(Character.isAlphabetic(c)) System.out.println("Alphabet");
    }    
}
