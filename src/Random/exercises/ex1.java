package Random.exercises;

/*
Stwórz program, w którym:

Zapytasz użytkownika, ile imion chce podać.
Pobierzesz te imiona i zapiszesz je do ArrayListy.
Wyświetlisz informację, ile jest na liście mężczyzn,
a ile kobiet, przyjmując że imiona kobiece kończą się na literę “a”.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int manNum = 0;
        int femNum = 0;

        ArrayList<String> names = new ArrayList<>();
        int numOfNames;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile imion chcesz podać?");
        numOfNames = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < numOfNames; i++) {
            System.out.println("Podaj imie nr. " +(i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        for(int i = 0; i < names.size(); i++) {
            if(names.get(i).charAt(names.get(i).length() - 1) == 'a') {
                femNum++;
            } else {
                manNum++;
            }
        }
        System.out.println("Jest tutaj tyle kobiet: " + femNum);
        System.out.println("Jest tutaj tyle mezczyzn: " + manNum);
    }
}
