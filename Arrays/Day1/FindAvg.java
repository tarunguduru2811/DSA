package Arrays.Day1;

class Solution{
    
    public static double findAvg(int arr[]){
        double sum = 0; 

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        double avg = sum / arr.length;

        return avg;
    }
    
    public static void main(String args[]){
        int[] arr = {1,3,3,4,5};
        System.out.println("Avg of an array : " + findAvg(arr));
    }
}