package Searching;

public class NoOfOccurences {
    public static int findOccurences(int[] arr,int target){
        int n=arr.length;
        int s=0;
        int e=arr.length-1;
        
        int lowerBound = n;
        int upperBound = n;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid] >= target){
                lowerBound = mid;
                //left
                e=mid-1;
            }else{
                //right
                s=mid+1;
            }
        }
        s=0;
        e=n-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>target){
                upperBound = mid;
                //left
                e=mid-1;
            }else{
                //right
                s=mid+1;
            }
        }

        return upperBound-lowerBound;
    }
    public static void main(String[] args) {
        int[] arr= {10,20,20,20,30,40,50};
        System.out.println(findOccurences(arr, 20));
    }
}
