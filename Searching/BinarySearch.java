package Searching;

public class BinarySearch {

    public static int binarySearch(int[] arr,int target){
        int s=0;
        int e=arr.length-1;

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
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println(binarySearch(arr, 40));

    }
}
