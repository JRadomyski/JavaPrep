package Labs.LAB04.ZAD01;

public class Osoba {
    private String imie;
    private String naziwsko;

    public Osoba(String imie, String naziwsko) {
        this.imie = imie;
        this.naziwsko = naziwsko;
    }

    @Override
    public String toString() {
        return imie + " " + naziwsko;
    }
}
