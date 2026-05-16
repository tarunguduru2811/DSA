package Arrays.Day6;

public class RotateImage {
    public static void findRotatedImage(int[][] arr){
        int n = arr.length;


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        for(int row=0;row<n;row++){
            int s=0; //starting col
            int e=n-1; // ending col

            while(s<=e){
                int temp = arr[row][s];
                arr[row][s] = arr[row][e];
                arr[row][e] = temp;
                s++;
                e--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        findRotatedImage(arr);

        System.out.println("Rotated Image");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
