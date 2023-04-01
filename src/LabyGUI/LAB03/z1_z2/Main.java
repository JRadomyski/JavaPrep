package LabyGUI.LAB03.z1_z2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {
            Square s1 = new Square(5);
            Square s2 = new Square(1);
            Square s3 = new Square(3);
            Square s4 = new Square(2);
            Square s5 = new Square(4);

            Square[] squares = {s1, s2, s3, s4, s5};

            System.out.println(Arrays.toString(squares));

            Arrays.sort(squares);

            System.out.println(Arrays.toString(squares));

            Arrays.sort(squares, (o1, o2) -> o2.getArea() - o1.getArea());

            System.out.println(Arrays.toString(squares));

            Square square = new Square(10);
        }catch (TooBigSquareException ex){
            System.out.println(ex);
            ex.printStackTrace();
        }


    }

}
