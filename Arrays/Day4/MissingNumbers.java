package Arrays.Day4;

import java.util.ArrayList;

public class MissingNumbers {

    public static ArrayList<Integer> findMissingNumbers(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int val = Math.abs(arr[i]);
            int idealPosition = val - 1;

            if(arr[idealPosition] > 0 ){
                arr[idealPosition] *= -1;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans.add(i+1);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5};

        ArrayList<Integer> ans = findMissingNumbers(arr);

        System.out.println(ans);

    }
}


