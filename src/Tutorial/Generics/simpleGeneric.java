package Tutorial.Generics;

public class simpleGeneric {
    public static void main(String[] args) {
        Square<Integer> integerSquare = new Square<>(10);
        System.out.println("int square area: " + integerSquare.getSurfaceArea());

        Square<Float> floatSquare = new Square<>(5.6f);
        System.out.println("float square area: " + floatSquare.getSurfaceArea());
    }
}
