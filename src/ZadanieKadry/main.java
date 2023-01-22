package ZadanieKadry;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kadry kadry = new Kadry();

        boolean alive = true;
        while(alive) {
            System.out.println("add - dodaje nowego pracownika\nshow - pokazuje zatrudnionych pracownikow\nexit - wychodzi z programu");
            String command = scanner.next();
            if(command.equals("exit")){
                System.out.println("Shutting down....");
                alive = false;
            }else if(command.equals("add")){
                kadry.dodajPracowinkaInteraktywnie();
            } else if (command.equals("show")) {
                kadry.pokazZatrudnionych();
            } else {
                System.out.println("Zle wprowadzone dane");
                alive = false;
            }

        }


    }
}
