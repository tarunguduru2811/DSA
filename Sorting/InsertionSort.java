package Sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1;i<n;i++){
            int curr = i;
            int prev = i-1;
            int currValue = arr[curr];

            while(prev>=0 && currValue<arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = currValue;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,5,3,2};

        insertionSort(arr);

        for(int val:arr){
            System.out.print(val + " ");
        }
    }
}
