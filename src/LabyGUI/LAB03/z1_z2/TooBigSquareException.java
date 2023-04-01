package LabyGUI.LAB03.z1_z2;

public class TooBigSquareException extends Exception{

    public TooBigSquareException(int max){
        super("Maximum length is " + max);
    }

}
