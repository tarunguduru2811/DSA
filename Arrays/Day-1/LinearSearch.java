public class LinearSearch {

    public static boolean findTarget(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,9,5};

        System.out.println(findTarget(arr, 4));
    }
}
