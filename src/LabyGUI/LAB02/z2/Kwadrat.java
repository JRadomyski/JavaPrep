package LabyGUI.LAB02.z2;

public class Kwadrat extends FiguraGeometryczna{
    private double bok;
    public Kwadrat(String kolor, double bok) {
        super(kolor);
        this.bok = bok;
    }

    @Override
    public double obliczPole() {
        return bok * bok;
    }

    @Override
    public double obliczObwod() {
        return (4 * bok);
    }

}
