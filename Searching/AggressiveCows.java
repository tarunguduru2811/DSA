package Searching;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean isValid(int[] stalls,int k,int minDistance){
        int cowCount = 1;
        int lastPosition = 0;

        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - stalls[lastPosition] >= minDistance){
                cowCount++;
                if(cowCount == k){
                    return true;
                }
                lastPosition = i;
            }
        }

        return false;
    }
    public static int findMinDist(int[] stalls,int k){
        int ans = -1;
        Arrays.sort(stalls);
        int s=0;
        int e=stalls[stalls.length-1] - stalls[0];

        while(s<=e){
            int mid = s+(e-s)/2;

            if(isValid(stalls,k,mid)){
                //store ans and move right
                ans = mid;
                s = mid+1;
            }else{
                //move left
                e = mid-1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] stalls = {1,2,4,8,9};
        int k = 3; 
        System.out.println(findMinDist(stalls, k));
    }
}



// [1, 2, 4, 8, 9] k = 3


// let's say we need to assign the minDistance b/w any two cows as 4 

// c1 -> 1 place c1 at first position
// c2 -> 2 ,dist = 2 - 1 -> 4 is not maintained
// c2 -> 4 ,dist = 4 - 1 -> 4 is not maintained
// c2 -> 8 ,dist = 8 - 1 -> 4 is maintained blw two cows ,so place c2 at 8
// c3 -> 9 ,dist = 9 - 8 -> 4 is not maintained 

// It means that we are not able to place the cows such that minDist b/w any two cows for 4 is not maintained.
// From this it is clear that all minDist. >= 4 is not possible so we can move left -> observation




// Let's dry run the above input 


// s = 0
// e = 9-1 = 8
// mid = 4 

// isValid(4) -> as we seen that we are not able to distribute the cows such that the min. dist is 4 ,so move left e = mid - 1


// s = 0
// e = 3
// mid = 1

// isValid(1) -> 1,2,4,8,9
// c1 -> 1 
// c2 -> 2 ,dist = 2 - 1 
// c3 -> 4 ,dist = 4 - 2 

// As we see that we are able to place the cows such that the min dist is 1 so it can be a potential answer and we need to
// maximise this ,obviously lesser number can satisfy so store ans and move right, ans = 1

// s = 2
// e = 3
// mid = 2

// isValid(2) -> 1,2,4,8,9
// c1 -> 1 
// c2 -> 2 ,dist = 2 - 1 
// c2 -> 4 ,dist = 4 - 1 
// c3 -> 8 ,dist = 8 - 4

// Valid -> ans = 2 and move right

// s = 3
// e = 3
// mid = 3

// isValid(3) -> 1,2,4,8,9
// c1 -> 1
// c2 -> 2 ,dist = 2 - 1
// c2 -> 4 ,dist = 4 - 1
// c3 -> 8 ,dist = 8 - 4 

// valid -> ans = 3 and move right

// s = 4 and e = 3 => not right condition so stop exec. and return ans  = 3
