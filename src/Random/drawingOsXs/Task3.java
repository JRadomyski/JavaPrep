package Random.drawingOsXs;

public class Task3 {
    public static void main(String[] args) {
        int n = 4;
        int size = n * 2 - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char mark;
                if (i % 2 == 0 && j % 2 == 0)
                    mark = 'X';
                else
                    mark = '0';
                System.out.print(mark + "\t");
            }
            System.out.println();
        }
    }
}
