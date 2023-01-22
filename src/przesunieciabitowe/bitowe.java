package przesunieciabitowe;

public class bitowe {
    public static void main(String[] args) {
        int liczba = 25; // 1 1 0 0 1
        // 0100
        // 0001
        // 0101
        int wynik = liczba >> 2;
        System.out.println(liczba);
        System.out.println(wynik);
    }
}
