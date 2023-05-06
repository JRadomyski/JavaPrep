package Labs.LAB02.z2;

public class Prostokat extends FiguraGeometryczna {
    private double bokA;
    private double bokB;

    public Prostokat(String kolor, double bokA, double bokB) {
        super(kolor);
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double obliczPole() {
        return bokA * bokB;
    }

    public double obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }
}