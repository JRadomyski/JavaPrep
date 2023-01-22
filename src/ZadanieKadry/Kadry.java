package ZadanieKadry;
import ZadanieKadry.Pracownik;
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

    void dodajPracowinkaInteraktywnie(){

    }




}



//        if (i < 100) {
//            if (i < pracownicy_.length) {
//                pracownicy_[i] = X;
//            } else {
//                Pracownik[] pracownicy_2 = new Pracownik[pracownicy_.length + 1];
//                for (int j = 0; j < pracownicy_.length; j++) {
//                    pracownicy_2[j] = pracownicy_[j];
//                }
//                pracownicy_2[i] = X;
//                pracownicy_ = pracownicy_2;
//            }
//        }