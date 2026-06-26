package Recursion;

public class BinarySearch {
   public static int findTarget(int[] arr,int target,int s,int e){
    //Base Case 
    if(s>e){
        return -1;
     }

     //1 Case Solve
     int mid = s + (e-s)/2;
     
     if(arr[mid] == target){
        return mid;
     }else if(target > arr[mid]){
        s = mid+1;
     }else{
        e = mid-1;
     }

     return findTarget(arr, target, s, e);
   }
   public static void main(String[] args) {
     int[] arr = {10,20,30,40,50,60,70};
     int target = 60;
     int s = 0;
     int e = arr.length-1;

     System.out.println(findTarget(arr,target,s,e));
   }
}
