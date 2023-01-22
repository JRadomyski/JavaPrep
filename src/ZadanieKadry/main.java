package ZadanieKadry;

public class main {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Maciej", "Chomicz", 399.33, 'M', 1);
        Pracownik pracownik2 = new Pracownik("Kuba", "Rad", 299.33, 'M', 2);
        Pracownik pracownik3 = new Pracownik("Aleks", "Mad", 449.33, 'M', 3);
        System.out.println(pracownik1.toString());
        System.out.println(pracownik2.toString());
        System.out.println(pracownik3.toString());

        Kadry kadry = new Kadry();
        kadry.dodajPracownika(pracownik1);
        kadry.pokazZatrudnionych();


    }
}
