package Arrays.Day2;

public class ShiftPos {

    public static void rightShiftBy1(int arr[]){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {9,10,1,2,3,4,5,6};
        rightShiftBy1(arr);

        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
