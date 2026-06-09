package Searching;

import java.util.Arrays;

public class RowMaxOnes {

    public static int getFirstOccr(int[][] arr,int rowIndex){
        int totalCols = arr[0].length;

        int s = 0;
        int e = totalCols-1;
        int ans = -1;
        
        //handle the case where there are no ones -> 0 0 0 0 so we can check that the last element is not one then we 
        // can say that there are no ones as it is sorted

        if(arr[rowIndex][e] == 0){
            //returnin totalCols because we need to get the no of ones as zero and we are subtracting this from totalCol
            //so in order to get zero we need to return totalCols  so that it will become zero
            return totalCols;
        }

        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[rowIndex][mid] == 0){
                //move right
                s = mid+1;
            }else{
                //store ans and move left
                ans = mid;
                e = mid-1;
            }
        }

        return ans;

    }
    //assuming that the each row can be sorted or not sorted
    public static int[] findRowWithMaxOnes(int[][] arr){
        int totalRows = arr.length;
        int totalCols = arr[0].length;

         int maxOnes = 0;
        int maxOnesRowIndex = 0;
        
        for(int row=0;row<arr.length;row++){
            Arrays.sort(arr[row]);
            int firstOccr = getFirstOccr(arr, row);
            int onesCount = totalCols - firstOccr;
            
            if(onesCount != 0 && onesCount > maxOnes){
                maxOnes = onesCount;
                maxOnesRowIndex = row;
            }
        }

        return new int[]{maxOnesRowIndex,maxOnes};

    }
   
    public static void main(String[] args) {
        int[][] arr = {
            {0,0},
            {1,1},
            {0,0}
        };
       
        int[] ans = findRowWithMaxOnes(arr);

        for(int val:ans){
            System.out.print(val + " ");
        }

   }


}
