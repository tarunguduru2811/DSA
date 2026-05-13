package Arrays.Day5;

import java.util.ArrayList;

public class RowSum {

    public static ArrayList<Integer> findRowSum(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();
         
        int m = arr.length;  //row
        int n = arr[0].length;  //col

        for(int row=0;row<m;row++){
            int sum=0;
            for(int col=0;col<n;col++){
                sum += arr[row][col];
            }
            ans.add(sum);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        ArrayList<Integer> ans = findRowSum(arr);
        System.out.println(ans);
    }
}
