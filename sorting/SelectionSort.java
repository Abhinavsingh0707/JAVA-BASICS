package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {49, 74, 25, 36, 88, 18, 31};

        // no of pass
        for(int i=0; i<arr.length; i++){
            int min = i;
            //Searching and Traverse
            for(int j=i+1; j<arr.length; j++){
                // to check smallest element indexpostion
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min]; //swap

            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
}
