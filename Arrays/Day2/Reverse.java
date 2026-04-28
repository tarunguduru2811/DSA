package Arrays.Day2;


public class Reverse {

    public static void reverseArray(int arr[]){
        int s=0;
        int e=arr.length -1;

        while (s<=e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};

        reverseArray(arr);

        for(int i:arr){
            System.out.print(i + " ");
        }
    }    
}
