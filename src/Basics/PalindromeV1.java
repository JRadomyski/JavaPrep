package Basics;


public class PalindromeV1 {
    public static void main(String[] args) {
        String text = "kajak";
        String reverse = "";


        for(int i = text.length() - 1; i >=0; i--) {
            reverse += text.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        if(palindrome) {
            System.out.println("Podany wyraz to palindrom!");
        } else {
            System.out.println("To nie Palindrom!");
        }

    }
}
