package Archive.tablice;

public class SwapValues {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};

        System.out.println("Numbers length: " + numbers.length);

        int lastIndex = numbers.length - 1;

        int temp = numbers[0];
        numbers[0] = numbers[lastIndex];
        numbers[lastIndex] = temp;


        for(int number : numbers){
            System.out.println(number + " ");
        }


    }

}
