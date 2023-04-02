package LabyGUI.LAB02.z2;

public class Kolo extends FiguraGeometryczna {
    private double promien;

    public Kolo(String kolor, double promien) {
        super(kolor);
        this.promien = promien;
    }

    public double obliczPole() {
        return Math.PI * promien * promien;
    }

    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}