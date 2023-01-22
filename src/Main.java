import Zadanie1.Programista;
import Zadanie2.TablicaObliczenia;
import Zadanie3.*;
public class Main {
    public static void main(String[] args) {
//Programista prog = new Programista("Jakub","Radomyski","Java",15000.99);

        int[] tablica = {5, 1, 199, 200, 4, 7};
        TablicaObliczenia tab = new TablicaObliczenia(tablica);

        System.out.println("Suma: " + tab.suma());
        System.out.println("Max val: " + tab.max());
        System.out.println("Min val: " + tab.min());

        Pracownik pracownik = new Pracownik("Kuba", "Rad", "intern angular dev", "XYZ");
        pracownik.przedstawSie();
    }
}