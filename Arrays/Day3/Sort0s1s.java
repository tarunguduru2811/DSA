package Arrays.Day3;

public class Sort0s1s {

    public static void sort0s1s(int arr[]){
        int s=0;
        int e=arr.length - 1;

        while(s<=e){
            if(arr[s] == 1){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                e--;
            }else{
                s++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,0,0,1,1};
        sort0s1s(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
