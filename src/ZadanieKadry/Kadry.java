package ZadanieKadry;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kadry {

      Pracownik[] pracownicy_ = new Pracownik[3];
      int zatrudnienie_;


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
        for(int i = 0; i < pracownicy_.length; i++){
            System.out.println(pracownicy_[i]);
        }
    }

    void dodajPracowinkaInteraktywnie() {
        Scanner scanner = new Scanner(System.in);
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
        Pracownik nowyInteraktywnie = new Pracownik(interaktywneImie, interaktywneNaziwsko, interaktywnaPlaca, interaktywnaPlec, interaktywnyDzial);
        dodajPracownika(nowyInteraktywnie);
    }
    void zapiszDoPlikuTekstowego(){
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("zatrudnieni.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        PrintWriter pw = new PrintWriter(fos);
        for(int i = 0; i == zatrudnienie_; i++){
            pw.println(pracownicy_[i]);
        }

        pw.close();
    }
//    void importujZPlikuTekstowego(){
//
//    }

    int sredniZarobek(){
        int suma=0;
        for(int i = 0; i < pracownicy_.length; i++){
            suma += pracownicy_[i].getPlaca();
        }
        int srednia = suma/pracownicy_.length;
        return srednia;
    }



}


