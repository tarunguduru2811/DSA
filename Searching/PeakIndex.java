package Searching;

public class PeakIndex {
    public static int findPeakIndex(int[] arr){
        int s=0;
        int e=arr.length-1;
        int ans=0;

        while (s<=e) {
            int mid=s+(e-s)/2;

            if(arr[mid] < arr[mid+1]){
                //it means that we are on the asc part of the array so the answer should be in the right part of the part
                s=mid+1;
            }else{
                //arr[mid]>=arr[mid+1],it means that we are on the desc part so the answer can be in this part or this can be potential answer.so store ans and move to left part because as it is in desc all the values in right will be lesser
                ans=mid;
                e=mid-1; 
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(findPeakIndex(arr));
    }
}
