package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int low = 0;
        int high = arr.length-1;
        int element = 60;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] == element){
                System.out.println("Element found at " + mid +" index position");
            }
            if (element > arr[mid]) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    }
}
