public class maximum_subarray {

    public static void findMax(int arr[]){

        int temp = 0;
        int temp2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                temp++;
            }
        }
        //condition for maximum sum if all the elements given in array are negative
        if (temp==0) {
            for (int i = 0; i < arr.length; i++) {
                temp2 = Math.max(temp2, arr[i]);
            }
            System.out.print("Maximum sum : "+temp2);
        } 
        
        
        
        else {
            int cs = 0;
            int ms = Integer.MIN_VALUE;
    
            for (int i = 0; i < arr.length; i++) {
                cs = cs + arr[i];
                if (cs<0) {
                    cs = 0;
                }
                ms = Math.max(ms, cs);
            }
            System.out.print("Maximun sum : "+ms);
        }
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        // int arr[] = {-4,-6,-10,-3,-1};
        findMax(arr);
    }
}
