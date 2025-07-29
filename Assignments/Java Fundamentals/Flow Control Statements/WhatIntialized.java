
public class WhatIntialized {
    public static void main(String[] args) {
        char c = '$';
        if(Character.isAlphabetic(c)) {
            System.out.println("Alphabet");
        } else if(Character.isDigit(c)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
