package Basics.interview;

public class PalindromeV2 {
    public static void main(String[] args) {
        String text = "jakub";
        char[] letters = text.toCharArray();
        char[] reversedLetters = new char[letters.length];

        for(int i = 0; i < letters.length; i++) {
            reversedLetters[i] = letters[letters.length-1];
        }

        System.out.println(letters);
        System.out.println(reversedLetters);
        System.out.println(reversedLetters);
    }
}
