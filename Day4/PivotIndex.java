package Day4;

public class PivotIndex {
    
    public static int findPivotIndex(int arr[]){
        int n = arr.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        
        leftSum[0] = arr[0];
        for(int i=1;i<n;i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }

        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        System.out.println(findPivotIndex(arr));

    }
}
