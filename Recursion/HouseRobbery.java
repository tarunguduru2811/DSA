package Recursion;

public class HouseRobbery {
    public static int findMaxProfitFromRobbery(int[] arr,int index){
        //Base Case
        if(index >= arr.length){
            return 0;
        }

        //1 case solve kardo baki recursion sambhal lega
        int stealCurrentHouse = arr[index] + findMaxProfitFromRobbery(arr, index+2); //we can't steal adjacent house if we steal current so that's why +2
        int leaveCurrentHouse = 0 + findMaxProfitFromRobbery(arr, index+1); //if we leave current house then we can steal next house that's why +1
        int finalAns = Math.max(stealCurrentHouse, leaveCurrentHouse);
        return finalAns;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        int index = 0;

        System.out.println(findMaxProfitFromRobbery(arr, index));
    }
}
