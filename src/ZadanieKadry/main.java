package ZadanieKadry;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pracownik pracownik1 = new Pracownik("Maciej", "Chomicz", 3132139.33, 'M', 1);
        Pracownik pracownik2 = new Pracownik("Kuba", "Rad", 2923413213219.33, 'M', 2);
        Pracownik pracownik3 = new Pracownik("Aleks", "Mad", 44321323219.33, 'M', 3);
        Kadry kadry = new Kadry();
        kadry.dodajPracownika(pracownik1);
        kadry.dodajPracownika(pracownik2);
        kadry.dodajPracownika(pracownik3);
        kadry.sredniZarobek();




        boolean alive = true;
//        while(alive) {
//            System.out.println("add - dodaje nowego pracownika\nshow - pokazuje zatrudnionych pracownikow\nsave - zapisuje do txt\nexit - wychodzi z programu");
//            String command = scanner.next();
//            if(command.equals("exit")){
//                System.out.println("Shutting down....");
//                alive = false;
//            }else if(command.equals("add")){
//                kadry.dodajPracowinkaInteraktywnie();
//            } else if (command.equals("show")) {
//                kadry.pokazZatrudnionych();
//            }else if (command.equals("save")) {
//                kadry.zapiszDoPlikuTekstowego();
//            }else {
//                System.out.println("Zle wprowadzone dane");
//                alive = false;
//            }
//
//        }
    }
}
