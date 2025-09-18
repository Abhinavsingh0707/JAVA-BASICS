package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {55, 32, 44, 25, 16};

        int length = arr.length;
        int temp;

        //no of passes
        for (int i = 0; i < length; i++) {
            boolean swapped = false;

            //array traversing
            for (int j = 0; j < length-1; j++) {

                //compare the adjacent element
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];  // swapping
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        for (int no : arr) {
            System.out.println(no+" ");
        }
    }
}
