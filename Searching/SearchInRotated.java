package Searching;

public class SearchInRotated {
    public static int binarySearch(int[] arr,int target,int s,int e){

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                //right search
                s = mid+1;
            }else{
                //left search
                e = mid-1;
            }
        }

        return -1;
    }

    public static int findPivot(int[] arr){
        int n=arr.length;
        int s=0;
        int e=arr.length-1;
        int ans=0;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid] <= arr[n-1]){
                //l2 move to left
                e=mid-1;
            }else{
                //l1 
                ans=mid;
                s=mid+1;
            }
        }

        return ans;
        
    }

    public static int searchInRotated(int[] arr,int target){
        int pivotIndex = findPivot(arr);
        int ans=-1;

        if( (target >= arr[0]) && (target <= arr[pivotIndex])){
            //first part
            ans = binarySearch(arr,target,0,pivotIndex );
        }else{
            //second part
            ans = binarySearch(arr,target,pivotIndex+1,arr.length-1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(searchInRotated(arr, 3));
    }
}
