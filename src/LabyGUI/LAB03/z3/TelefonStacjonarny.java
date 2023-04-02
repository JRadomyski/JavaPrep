package LabyGUI.LAB03.z3;

public class TelefonStacjonarny extends Urzadzenie implements Dzowni{
    public TelefonStacjonarny(String producent, int cena) {
        super(producent, cena);
    }

    @Override
    public void Dzwoni() {
        System.out.println("Dzwonienie z Telefonu Stacjonarnego....");
    }

    @Override
    public String funkcjonalnosc() {
        return "Lacze z innym telefonem....";
    }
}
