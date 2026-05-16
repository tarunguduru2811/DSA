package Arrays.Day6;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {
    public static List<Integer> printSpiral(int[][] matrix){
       List<Integer> ans =  new ArrayList<>();

       int m = matrix.length;
       int n = matrix[0].length;

       int startRow = 0;
       int endRow = m-1;

       int startCol = 0;
       int endCol = n-1;


       while(startCol<=endCol && startRow <= endRow){
        //left -> right print startRow
        for(int i=startCol;i<=endCol;i++){
            ans.add(matrix[startRow][i]);
        }
        startRow++;

        //top -> bottom print endCol
        for(int i=startRow;i<=endRow;i++){
            ans.add(matrix[i][endCol]);
        }
        endCol--;

        //right -> left print endRow
        if(startRow <= endRow){
            for(int i=endCol;i>=startCol;i--){
                ans.add(matrix[endRow][i]);
            }
        }
       
        endRow--;

        //bottom -> top print startRow
        if(startCol <= endCol){
            for(int i=endRow;i>=startRow;i--){
                ans.add(matrix[i][startCol]);
            }
        }
        
        startCol++;

       }
       return ans;
    }
    
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        List<Integer> ans = printSpiral(arr);

        System.out.println(ans);
    }
}
