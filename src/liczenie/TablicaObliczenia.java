package liczenie;

public class TablicaObliczenia {
    private int[] tablica;
    public TablicaObliczenia(int[] podajTablice){
        this.tablica = podajTablice;
    }
    public int suma(){
        int suma = 0;
        for(int i = 0; i < tablica.length; i++){
            suma +=  tablica[i];
        }
        return suma;
    }

    int srednia(){
        return suma() /tablica.length;
    }

    public int min(){
        int min = tablica[0];
        for(int i = 0; i < tablica.length; i++){
            if(tablica[i] < min){
                min = tablica[i];
            }
        }
        return min;
    }

    public int max(){
        int max = tablica[0];
        for(int i = 0; i < tablica.length; i++){
            if(tablica[i] > max){
                max = tablica[i];
            }
        }
        return max;
    }



}
