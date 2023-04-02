package LabyGUI.LAB02.z2;
public abstract class FiguraGeometryczna {
    private String kolor;

    public FiguraGeometryczna(String kolor) {
        this.kolor = kolor;
    }

    public abstract double obliczPole();
    public abstract double obliczObwod();

    @Override
    public String toString() {
        return "Figura: " + this.getClass().getSimpleName() +
                " Kolor: " + this.kolor + " Obwod: " + obliczObwod() + " Pole: " +
                obliczPole();
    }

}
