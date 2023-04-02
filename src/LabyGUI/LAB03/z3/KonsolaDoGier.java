package LabyGUI.LAB03.z3;

public class KonsolaDoGier extends Urzadzenie implements GraWGre, Surfuje {
    private boolean maPolaczenieInternetowe;

    public KonsolaDoGier(String producent, int cena, boolean maPolaczenieInternetowe) {
        super(producent, cena);
        this.maPolaczenieInternetowe = maPolaczenieInternetowe;
    }

    @Override
    public void gra() {
        System.out.println("Gram w grę");
    }


    @Override
    public void surfuje() {
        System.out.println("Nie surfuje bo nie mam polaczenie z Internetem!");
    }
    public void surfuje(boolean maPolaczenieInternetowe){
        if(maPolaczenieInternetowe){
            System.out.println("Lacze sie z Internetem");
        }
    }
}
