package Archive.wyjatki;

public class CPUException extends Exception{
    public CPUException(){
        System.out.println("Żadnej roboty nie wezmę, nie wiem, nie znam się, nie orientuję się, zarobiony jestem!");
    }
    public CPUException(String arg){
        System.out.println("Blad: " + arg);
    }
}
