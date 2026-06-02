package Searching;

public class PivotIndexRotated {
    public static int findPivotIndexRotated(int[] arr){
        int n=arr.length;
        int s=0;
        int e=n-1;
        int ans = 0;

        while(s<=e){
            int mid=s+(e-s)/2;

            //we have two line l1 and l2
            //l1 : 50,60,70
            //l2 : 10,20,30,40
            //key observation : all the elements in l1 are greater then last element of array
            if(arr[mid] <= arr[n-1]){
                //we are on l2 , answer should be on the l1 so move left
                e=mid-1; 
            }else{
                //arr[mid] >= arr[n-1],we are on l1 so it can be potential ans so store it
                //and if we have another answer then it should be definetly on the right part
                ans = mid;
                s=mid+1;
            }

        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        // int[] arr = {3,1};
        System.out.println(findPivotIndexRotated(arr));
    }
}
