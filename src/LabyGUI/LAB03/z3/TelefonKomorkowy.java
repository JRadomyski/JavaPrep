package LabyGUI.LAB03.z3;

public class TelefonKomorkowy extends Urzadzenie implements Dzowni, WysylaSMS{
    boolean czyMaSIM;
    public TelefonKomorkowy(String producent, int cena, boolean czyMaSIM) {
        super(producent, cena);
        this.czyMaSIM = czyMaSIM;
    }

    @Override
    public void Dzwoni() {
        System.out.println("Nie dzwonie bo nie mam karty SIM!");
    }

    public void Dzwoni(boolean czyMaSIM) {
        if(czyMaSIM){
            System.out.println("Telefon dzwoni");
        }
    }

    @Override
    public void wyslijSMS() {
        System.out.println("Nie moge wyslac SMS-a bo nie mam karty SIM!");
    }
    public void wyslijSMS(boolean czyMaSIM) {
        if(czyMaSIM){
            System.out.println("Telefon wysyla SMS");
        };
    }

}
