package Searching;



public class EKO_SPOJ {
    public static boolean isValid(int[] arr,int m,int maxHeight){
        int totalWoodCollected = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxHeight){
                int currentWoodCollected =  arr[i] - maxHeight;
                totalWoodCollected += currentWoodCollected;
            }
        }

        if(totalWoodCollected >= m){
            return true;
        }else{
            return false;
        }
    }
    public static int findMaxHeightofSaw(int[] arr,int m){
        int maxi=arr[0];
        for(int val:arr){
            if(val > maxi){
                maxi = val;
            }
        }

        int s=0;
        int e = maxi;
        int ans = -1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(isValid(arr,m,mid)){
                //store ans and move right
                ans = mid;
                s = mid+1;
            }else{
                //move left
                e = mid-1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,42,40,26,46};
        int m = 20;
        
        System.out.println(findMaxHeightofSaw(arr, m));
        
    }
}


