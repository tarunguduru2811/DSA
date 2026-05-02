package Day4;

public class TwoSum {

    public static int[] findTwoSum(int[] arr,int target){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{0,0};
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int target = 6;

        int ans[] = findTwoSum(arr,target);

        System.out.println("The indexes are " + ans[0] + " " + ans[1]);
    }    
}

