package LabyGUI.LAB03.z1_z2;

public class Square implements Comparable<Square>, Figure {

    private int length;
    private int number;
    private static int counter;

    public Square(int length) throws TooBigSquareException{
        if (length > max)
            throw new TooBigSquareException(max);
        this.length = length;
        number = ++counter;
    }

    public int getArea(){
        return length * length;
    }

    @Override
    public int getPerimeter() {
        return 4*length;
    }

    @Override
    public int compareTo(Square o) {
        return getArea() - o.getArea();
    }

    @Override
    public String toString() {
        return "(" + number + "): " + getArea();
    }
}
