package Arrays.Day2;

public class ShiftPosByK {

    public static void rightShiftPosByK(int arr[],int k){
        
        int n = arr.length;
        if (arr == null || arr.length == 0) return;
        
        if(k==0) return;
        k = k % n;
        
        int temp[] = new int[k];
        int j = k - 1;
        

        //stpring last k values in temp array
        //Running array from last to last-k-1

        for(int i=n-1;i>n-1-k;i--){
            temp[j--] = arr[i];
        }

        //We need to make shift by k that's why we are doing i-k 
        //Running till i>=k to include the k values
        for(int i=n-1;i>=k;i--){
            arr[i] = arr[i-k];
        }

        for(int i=0;i<k;i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;

        rightShiftPosByK(arr,k);

        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
