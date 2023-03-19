package Archive.zadanieKadry;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double placa;
    private char plec;
    private int dzial;

    public Pracownik(String imie, String nazwisko, double placa, char plec, int dzial){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.placa = placa;
        this.plec = plec;
        this.dzial = dzial;
    }

    @Override
    public String toString() {
        return super.toString() + " \tImie "+ imie + " | nazwisko " + nazwisko + " | placa "+ placa + " | plec "+ plec + " | dzial "+ dzial;
    }
    boolean czyPracujeWDziale(int numer_dzialu){
        boolean czy = false;
        if(dzial == numer_dzialu){
            czy = true;
        }
        return czy;
    }

    public double getPlaca(){
        return placa;
    }


}
