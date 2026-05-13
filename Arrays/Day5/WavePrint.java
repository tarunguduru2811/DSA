package Arrays.Day5;

import java.util.ArrayList;

public class WavePrint {
    public static ArrayList<Integer> findWavePrint(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int m = arr.length; //rows
        int n = arr[0].length; //cols

        for(int col=0;col<n;col++){
            //if index is even top->bottom and for odd  bottom->top
            if((col&1) == 1){
                //odd
                for(int row=m-1;row>=0;row--){
                    ans.add(arr[row][col]);
                }
            }else{
                //even
                for(int row=0;row<m;row++){
                    ans.add(arr[row][col]);
                }
            }
        }

        //3 => 011 & 001 => 001
        //2 => 010 & 001 => 000

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        ArrayList<Integer> ans = findWavePrint(arr);

        System.out.println(ans);
    }
}
