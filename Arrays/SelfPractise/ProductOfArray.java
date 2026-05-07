package Arrays.SelfPractise;

public class ProductOfArray {
    
    public static int[] productOfArrayExcept(int arr[]){
        int n = arr.length;
        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        //leftmost element
        left[0]=1;

        //rightmost element
        right[n-1]=1;

        //find left multiplication of all elements
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * arr[i-1];
        }

        //find right multiplication of all elements
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1] * arr[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productOfArrayExcept(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
