package Random.drawingOsXs;

public class Task4 {
    public static void main(String[] args) {
        int n = 4;
        int size = n * 2 - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char mark;
                if (j == 0 || j == size - 1 || i==j || i+j==size-1)
                    mark = 'X';
                else
                    mark = '0';
                System.out.print(mark + "\t");
            }
            System.out.println();
        }
    }
}
