package wyjatki;

public class PrisonException extends Exception{
    public PrisonException(){
        System.out.println("To siare tez zes wpuscil?");
    }
    public PrisonException(String arg){

        System.out.println("to "+ arg + " tez wpsucil?");
    }
}
