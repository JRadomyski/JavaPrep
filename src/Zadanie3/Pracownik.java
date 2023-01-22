package Zadanie3;

public class Pracownik extends Osoba {
    private String stanowisko;
    private String nazwaFirmy;
    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;

    }
    public void przedstawSie() {
        System.out.printf("Jestem " + imie + " " + nazwisko + " i pracuje jako " + stanowisko + " w " + nazwaFirmy );
    }
}
