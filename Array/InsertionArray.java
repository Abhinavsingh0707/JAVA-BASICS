package Arrays;

public class InsertionArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int indexpos = 2;
        int element = 100;
         
        // Create new array of size greater then old array
        int[] newArr = new int[arr.length+1];
        // Copy paste the elements for old array to new array till indexpos-1;
        for (int i = 0; i < indexpos; i++) {
            newArr[i] = arr[i];
        }
        //Insert provided element to the particular index
        newArr[indexpos] = element;
        //Cpy paste the pending element of the old array to new array
        for (int i = indexpos; i < arr.length; i++) {
            newArr[i+1]=arr[i];
        }
        // traverse the array and print the element
        for (int i : newArr) {
            System.out.println(i);
        }
    }
}
