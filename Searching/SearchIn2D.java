package Searching;

public class SearchIn2D {
    
    public static boolean searchIn2D(int[][] arr,int target){
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int n = totalCols * totalRows;

        int s =0;
        int e = n-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int rowIndex = mid / totalCols;
            int colIndex = mid % totalCols;
            if(arr[rowIndex][colIndex] == target){
                return true;
            }else if(arr[rowIndex][colIndex] < target){
                //move right
                s = mid + 1;
            }else{
                //move left
                e = mid-1;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12,13}
        };

        int target = 15;

        System.out.println(searchIn2D(arr, target));
    }
}
