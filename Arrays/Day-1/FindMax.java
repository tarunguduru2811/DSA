public class FindMax {

    public static int findMax(int[] arr){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {19,2,4,-1,50,1,9,5};

        int max = findMax(arr);

        System.out.println("Max Element: " + max);
    }
}
