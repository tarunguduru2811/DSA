package Searching;

public class PainterPartition {
    public static boolean isValidAnswer(int maxPainted,int[] arr,int k){
        int paintersCount = 1;
        int paintedBoard = 0;

        for(int i=0;i<arr.length;i++){
            if(paintedBoard + arr[i] <= maxPainted){
                paintedBoard += arr[i];
            }else{
                paintersCount++;

                if(paintersCount > k || maxPainted < arr[i]){
                    return false;
                }else{
                    paintedBoard=0;
                    paintedBoard += arr[i];
                }
            }
        }

        return true;
    }
    public static int findMinTime(int[] arr,int k){
        int sum=0;
        for(int val:arr){
            sum += val;
        }

        int s=1;
        int e=sum;
        int ans=-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(isValidAnswer(mid,arr,k)){
                ans = mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 15};
        int k=3;
        System.out.println(findMinTime(arr, k));

    }
}
