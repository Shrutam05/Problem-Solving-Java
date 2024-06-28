import java.util.Arrays;

public class chocolate_distribution {

    public static int minSum(int arr[],int m){
        if (arr.length==0 || m==0) {
            return 0;
        }
        if (m>arr.length) {
            return -1;
        }
        Arrays.sort(arr);
        int i=0;
        int end = i+m-1;
        int minDiff = Integer.MAX_VALUE;
        while (i<arr.length && end<=arr.length-1) {
            int diff = arr[end]-arr[i];
            minDiff = Math.min(minDiff, diff);
            i++;
            end++;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 12, 23, 25, 28, 30, 30, 40, 41, 42, 43, 44, 48, 50};
        System.out.print(minSum(arr,7));
    }
}
