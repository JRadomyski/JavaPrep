package tablice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,8,15,1,24,13,4};

        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i : arr){
            System.out.println(i);
        }

    }

}
