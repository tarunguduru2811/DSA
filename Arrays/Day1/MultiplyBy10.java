package Arrays.Day1;

public class MultiplyBy10 {

    public static int[] multiplyby10(int arr[]){
        int[] ansArray = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            ansArray[i] = arr[i]*10;
        }

        return ansArray;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans[] = multiplyby10(arr);

        System.out.println("Printing Ans Array");
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
}
