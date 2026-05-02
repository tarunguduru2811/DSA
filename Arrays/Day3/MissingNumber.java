package Arrays.Day3;

public class MissingNumber {
    public static int findMissing(int arr[]){
        int xorSum = 0;

        //xor with all elements of array
        for(int i:arr){
            xorSum = xorSum ^ i;
        }

        for(int i=1;i<=arr.length;i++){
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }
    public static void main(String[] args) {
        //0-n elements all are distinct, one number is missing...
        int arr[] = {9,6,4,2,3,5,7,0,1};

        int ans = findMissing(arr);
        System.out.println("Missing Number in array is " + ans);
    }
}
