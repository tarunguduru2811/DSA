package Searching;

public class UpperBound {
    public static int getUpperBound(int[] arr,int target){
        //Upper bound -> smallest index whose value is greater than target
        int s=0;
        int e=arr.length-1;
        int ans=-1;

        while (s<=e) {
            int mid=s+(e-s)/2;

            if(arr[mid] > target){
                ans=mid;
                //left
                e=mid-1;
            }else{
                //right
                s=mid+1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2, 3, 7, 10, 11, 11, 25};
        System.out.println(getUpperBound(arr, 11));
    }
}
