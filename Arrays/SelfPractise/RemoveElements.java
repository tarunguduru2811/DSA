package Arrays.SelfPractise;

public class RemoveElements {
    public static int removeElements(int[] arr,int k){
        int readIndex = 0;
        int writeIndex = 0;

        for(readIndex=0;readIndex<arr.length;readIndex++){
            while(readIndex < arr.length && arr[readIndex] != k){
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
                readIndex++;
            }
        }

        return writeIndex;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int ans =  removeElements(arr, 2);
        System.out.println(ans);
        
        for(int i=0;i<ans;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
