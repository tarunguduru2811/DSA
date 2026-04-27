public class SwapAlternates {

 
    public static int[] swapAlternates(int arr[]){
        int newArr[] = new int[arr.length];

        int i=0;

        while(i<arr.length-1){
            newArr[i] = arr[i+1];
            newArr[i+1] = arr[i];
            i=i+2;
        }
         
        return newArr;
    }

   
    public static void main(String[] args) {
        int arr[] = {1,2,3,8,7,4,5,6};

        int[] ans = swapAlternates(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
