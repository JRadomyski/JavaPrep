package Random.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scanner.nextLine();
        Map<Character, Integer> letterMap = new HashMap<>();

        for (char letter : sentence.toCharArray()) {
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                letterMap.put(letter, letterMap.getOrDefault(letter, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

