package Searching;

public class SearchAlmostSorted {
    public static int findTargetInAlmostSorted(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid] == target){
                return mid;
            }else if(mid-1>=s && arr[mid-1] == target){
                return mid-1;
            }else if(mid+1<=e && arr[mid+1] == target){
                return mid+1;
            }else if(arr[mid] < target){
                //move right
                s=mid+1;
            }else{
                //move left
                e=mid-2; //we have already checked the previous values as mid-1 that's why move -2
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int target = 20;

        System.out.println(findTargetInAlmostSorted(arr, target));
    }
}



