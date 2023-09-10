package random.drawingOsXs;

public class Task2 {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                char mark;
                if (i == 0 || i == n - 1 || j == 0 || j == n-i-1)
                    mark = 'X';
                else
                    mark = '0';

                System.out.print(mark + "\t");
            }
            System.out.println();
        }
    }
}
