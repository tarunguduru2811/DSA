package Arrays.Day5;

public class TransposeMatrix {
    
    public static int[][] findTranspose(int[][] arr){
        int m = arr.length; //rows
        int n = arr[0].length; //cols

        int newTotalRows = n;
        int newTotalCols = m;

        int[][] ans = new int[newTotalRows][newTotalCols];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] ans = findTranspose(arr);

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}
