// Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.
// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
//         Maximum element is: 9

public class find_max_min {

    public static int findMin(int arr[]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // min = Math.min(min, arr[i]);
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // max = Math.max(max, arr[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,4,1,9};
        System.out.println("Minimum element is: "+findMin(arr));
       System.out.print("Maximum element is: "+findMax(arr));
    }
}