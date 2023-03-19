//1. Stwórz tablicę zawierającą elementy typu String
//2. Przy pomocy pętli odwróć kolejność elementów
// Przykład: {"Papa","Juliett","Alfa","Tango","Kilo"} ---zmień do--> {"Kilo","Tango","Alfa","Juliett","Papa"}
package Archive.tablice;

public class task1 {
    public static void main(String[] args) {
        String[] tab1 = {"Papa", "Juliett", "Alfa", "Tango", "Kilo"};
        for(int i = 0; i < tab1.length/2; i++){
            String temp = tab1[i];
            tab1[i] = tab1[tab1.length - i - 1];
            tab1[tab1.length - i - 1] = temp;
        }
        for(String i : tab1){
            System.out.println(i);
        }
    }
}
