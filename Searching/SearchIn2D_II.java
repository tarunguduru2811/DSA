package Searching;

public class SearchIn2D_II {
    // we are not able to apply binary search on this because it is not sorted if we arrange it on 1D.
    // optimal solution -> 
    // Four directions for single cell -> top,down,left and right
    //moving left -> get smaller values
    //moving right -> get higher values
    //moving down -> get higher values
    //moving up -> get lower values

    //Here at one particular location we are confused which side to move for lesser two possibilties and 
    //higher two possibilties.
    //so we are restricting two directions and allowing two directions
    //Allowed directions -> down and left
    //starting position top right element 

    public static boolean search2D_II(int[][] arr,int target){
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int row = 0;
        int col = totalCols - 1;

        while(row < totalRows && col >= 0){
            if(arr[row][col] == target){
                return true;
            }
            else if(arr[row][col] > target){
                //target is less so move for lesser values and for less we have left 
                col--;
            }else{
                //target is high so move for higher values and for high we have down
                row++;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        //row wise and col wise sorted
        int[][] arr = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}, 
        };

        int target = 13;

        System.out.println(search2D_II(arr, target));
    }
}
