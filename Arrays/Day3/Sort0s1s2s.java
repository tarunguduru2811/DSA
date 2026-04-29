package Arrays.Day3;

public class Sort0s1s2s {

    public static void sortColors(int arr[]){
        int l=0;
        int m=0;
        int h=arr.length-1;

        while(m<=h){
            if(arr[m] == 0){
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                
                m++;
                l++;

            }else if(arr[m] == 1){
                m++;
            }else{
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sortColors(arr);

        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
