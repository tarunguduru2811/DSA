package Arrays.Day1;

public class ExtremeValues {

    public static void printExtremeValues(int arr[]){
        int s=0;
        int e=arr.length-1;

        while(s<=e){
            if(s==e){
                System.out.print(arr[s] + " ");
            }else{
                System.out.print(arr[s] + " " + arr[e] + " ");
            }
            
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        printExtremeValues(arr);
    }
}
