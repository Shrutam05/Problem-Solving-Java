// Given an array (or string), the task is to reverse the array/string.
// Examples:
// Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}


public class array_reverse {

    public static void arrayReverse(int arr[]){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        arrayReverse(arr);
    }
}
