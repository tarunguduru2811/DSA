package Arrays.SelfPractise;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] arr){
        int i=0;
        int maxi = -1;

        for(i=0;i<arr.length;i++){
            int count=0;
            while(i<arr.length && arr[i] == 1 ){
                count++;
                i++;
            }

            if(count > maxi){
                maxi = count;
            }
        }

        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
