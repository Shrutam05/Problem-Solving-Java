public class rotated_sorted_array {
    public static int pivotedBinarySearch(int arr[], int n, int key){
        int pivot = findPivot(arr, 0, n-1);

        if (pivot==-1) {
            return binarySearch(arr,0,n-1,key);
        }
        if (arr[pivot]==key) {
            return pivot;
        }
        else if (arr[0]<=key) {
            return binarySearch(arr, 0, pivot-1, key);
        }
        else{
            return binarySearch(arr, pivot+1, n-1, key);
        }
    }

    public static int binarySearch(int arr[], int low, int high, int key){
        if (low>high) {
            return -1;
        }

        int mid = (high+low)/2;
        if (arr[mid]==key) {
            return mid;
        }
        else if (arr[mid]>key) {
            return binarySearch(arr,low,mid-1,key);
        }
        else{
            return binarySearch(arr,mid+1,high,key);
        }
    }

    public static int findPivot(int arr[], int low, int high){
        if (low>high){
            return -1;
        }
        if (low==high) {
            return low;
        }
        int mid = (high + low)/2;
        if (mid<high && arr[mid+1]<arr[mid]) {
            return mid;
        }
        if (mid>low && arr[mid-1]>arr[mid]) {
            return mid-1;
        }
        if (arr[low]>=arr[mid]) {
            return findPivot(arr, low, mid-1);
        } else {
            return findPivot(arr, mid+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = arr.length;
        int key = 8;
        System.out.println("Index of the element is : "+ pivotedBinarySearch(arr, n, key));
    }
}
