package Labs.LAB04.ZAD01;

public class Samochod {

    enum Marka{BMW, VOLVO, SKODA, MAZDA};
    private Marka marka;
    private String nrRej;



    public Samochod(String nrRej, Marka marka) {
        this.nrRej = nrRej;
        this.marka = marka;
    }

    public String getNrRej() {
        return nrRej;
    }

    @Override
    public String toString() {
        return marka + nrRej;
    }
}
