package Arrays.Day1;

public class SumOfPosNeg {

    public static int[] findSumPosNeg(int arr[]){
        int posSum = 0;
        int negSum = 0;
        int[] ansArray;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posSum += arr[i];
            }else{
                negSum += arr[i];
            }
        }

        ansArray = new int[]{posSum,negSum};

        return ansArray;

    }
    public static void main(String[] args) {
        int arr[] = {2,-1,3,5,-2,-5};

        int ans[] = findSumPosNeg(arr);

        System.out.println("Sum of Positive Numbers: " + ans[0]);
        System.out.println("Sum of Negative Numbers: " + ans[1]);
    }
}
