package LabyGUI.LAB03.z3;

public class KonsolaDoGier extends Urzadzenie implements WyswietlaObraz, Gra {
    private boolean maPolaczenieInternetowe;

    public KonsolaDoGier(String producent, double cena, boolean maPolaczenieInternetowe) {
        super();
        this.maPolaczenieInternetowe = maPolaczenieInternetowe;
    }

    @Override
    public void wyswietlObraz(String adres) {
        System.out.println("Wyświetlam obraz z adresu: " + adres);
    }

    @Override
    public void graj() {
        System.out.println("Gram w grę");
    }

    public boolean isMaPolaczenieInternetowe() {
        return maPolaczenieInternetowe;
    }

    public void setMaPolaczenieInternetowe(boolean maPolaczenieInternetowe) {
        this.maPolaczenieInternetowe = maPolaczenieInternetowe;
    }
