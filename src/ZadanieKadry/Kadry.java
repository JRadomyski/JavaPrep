package ZadanieKadry;
import ZadanieKadry.Pracownik;
import java.util.Scanner;

public class Kadry {

    private Pracownik[] pracownicy_ = new Pracownik[100];
    private int zatrudnienie_;

    public Kadry(){
        zatrudnienie_ = -1;
    }

    void dodajPracownika(Pracownik nowy) {
        if(zatrudnienie_==100){
            System.out.println("Stos jest pelny!");
        }else{
            pracownicy_[++zatrudnienie_] = nowy;
        }
    }

    void pokazZatrudnionych(){
        for(int i = 0; i == zatrudnienie_; i++){
            System.out.println(pracownicy_[i]);
        }
    }
    boolean alive = true;
    void dodajPracowinkaInteraktywnie(){
        Scanner scanner = new Scanner(System.in);
        while(alive) {
            System.out.println("Czy chcesz dodać nowego pracownika?: Jeżeli tak to napisz TAK, jeżeli nie to napisz NIE");
            String command = scanner.next();
            if(command.equals("NIE")){
                alive = false;
                pokazZatrudnionych();
            }else if(command.equals("TAK")){
                System.out.println("Podaj imie: ");
                String interaktywneImie = scanner.next();
                System.out.println("Podaj Naziwsko: ");
                String interaktywneNaziwsko = scanner.next();
                System.out.println("Podaj Place: ");
                double interaktywnaPlaca = scanner.nextDouble();
                System.out.println("Podaj plec: ");
                char interaktywnaPlec = scanner.next().charAt(0);
                System.out.println("Podaj dzial: ");
                int interaktywnyDzial = scanner.nextInt();
                Pracownik nowyInteraktywnie = new Pracownik(interaktywneImie, interaktywneNaziwsko,interaktywnaPlaca, interaktywnaPlec, interaktywnyDzial);
                dodajPracownika(nowyInteraktywnie);
            }else{
                System.out.println("Zle wprowadzone dane");
                alive = false;
            }

        }
    }

}


