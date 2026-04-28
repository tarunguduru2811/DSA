package Arrays.Day1;

public class CountZeroes {

    public static int[] countZeroesOnes(int arr[]){
        int zeros = 0;
        int ones = 0;
        int ans[];

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zeros++;
            }else{
                ones++;
            }
        }

        ans = new int[]{zeros,ones};

        return ans;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,0,1,0,0,1};
        int ans[] = countZeroesOnes(arr);

        System.out.println("The No. of Zeroes are " +  ans[0]);
        System.out.println("The No. of Ones are " +  ans[1]);
    }
}
