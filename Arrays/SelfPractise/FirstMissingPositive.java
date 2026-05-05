package Arrays.SelfPractise;

public class FirstMissingPositive {

    public static int findFirstMissingPositive(int arr[]){
        int i=0;

        while(i<arr.length){
            int value = arr[i];
            int idx = value - 1;

            if(value>0 && value<arr.length && arr[idx] != arr[i]){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }

        return arr.length + 1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,-1,1};
        int ans = findFirstMissingPositive(arr);
        System.out.println(ans);
    }
}
