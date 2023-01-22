package ZadanieKadry;
import ZadanieKadry.Pracownik;
public class Kadry {
    private Pracownik [] pracownicy_;
    private int zatrudnienie_;

    public Kadry(){

    }
    int i = 0;
    void dodajPracownika(Pracownik X) {
        if (i < 100) {
            if (i < pracownicy_.length) {
                pracownicy_[i] = X;
            } else {
                Pracownik[] pracownicy_2 = new Pracownik[pracownicy_.length + 1];
                for (int j = 0; j < pracownicy_.length; j++) {
                    pracownicy_2[j] = pracownicy_[j];
                }
                pracownicy_2[i] = X;
                pracownicy_ = pracownicy_2;
            }
        }
    }




}
