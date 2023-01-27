package RGBA;

public class Pixel {
    class ZerosException extends Exception{
        ZerosException(){
            super("All entered values are zeroes!");
        }
    }
    public Pixel(int  r, int g, int b, int a) throws ZerosException {
        if(r == 0 & g == 0 & b ==0 & a ==0){
            throw new ZerosException();
        }
    }
}
