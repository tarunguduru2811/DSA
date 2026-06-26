package Recursion;

public class ClimbStairs {
    
    public static int findNoOfWays(int n){
        if(n==1){
            return 1;
        }

        if(n==2){
            return 2;
        }

        int ans = findNoOfWays(n-1) + findNoOfWays(n-2);

        return ans;
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(findNoOfWays(n));
    }    
}
