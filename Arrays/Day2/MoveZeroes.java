package Arrays.Day2;

public class MoveZeroes {
    
    static void moveZeroesToEnd(int arr[]){
        
        //for iterating array
        int i=0;

        //for non-zero elements
        int j=0;

        while(i < arr.length ){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }else{
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};

        moveZeroesToEnd(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}



