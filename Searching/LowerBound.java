package Searching;

public class LowerBound {
    public static int getLowerBound(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        int ans= -1;
        //Lower bound => smallest index whose value is greater than or equal to index;

        while(s<=e){
            int mid = s+(e-s)/2;
            
            if(arr[mid] >= target){
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
        int[] arr = {10,20,30,30,30,40,50,60,70};
        System.out.println(getLowerBound(arr,35));
    }
}
