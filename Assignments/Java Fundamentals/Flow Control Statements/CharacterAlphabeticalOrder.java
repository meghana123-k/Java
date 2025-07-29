
public class CharacterAlphabeticalOrder {
    public static void main(String[] args) {
        int c1 = (int)'f';
        int c2 = (int)'a';

        if(c1 > c2) System.out.println((char)c2 + ", "+(char)c1); 
        else System.out.println((char) c1 + ", " + (char) c2);
    }
}
