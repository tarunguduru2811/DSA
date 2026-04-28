package Arrays.Day1;

public class Unsorted {
    
    public static int findFirstUnsorted(int arr[]){

        for(int i=0;i<arr.length;i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,4,9};

        System.out.println("First Unsorted Element "+ findFirstUnsorted(arr));
    }
}
