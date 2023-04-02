package LabyGUI.LAB03.z3;

public abstract class Urzadzenie {
    private String producent;
    private int cena;

    public Urzadzenie(String producent, int cena) {
        this.producent = producent;
        this.cena = cena;
    }



    @Override
    public String toString() {
        return "Urzadzenie: " + this.getClass().getSimpleName()
                + " producent: " + producent +
                " cena:" + cena;
    }
    public double getCena(){
        return cena;
    }

}
