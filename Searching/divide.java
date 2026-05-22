package Searching;

public class divide {
    
    public static int findDivide(int divident,int divisor){
        int s=0;
        int e=divident;
        int ans=-1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(mid*divisor == divident){
                return mid;
            }else if(mid*divisor > divident){
                //left
                e=mid-1;
            }else{
                //potential and move right
                ans = mid;
                s=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int divident = 50;
        int divisor = 6;
        double ans = findDivide(divident, divisor);
        int doublePrecision = 3;
        double factor = 1;

        for(int round=0;round<=doublePrecision;round++){
            factor = factor/10;
            double newAns = ans;

            for(int i=1;i<=10;i++){
                newAns = newAns + factor;
                if(newAns * divisor < divident){
                    ans = newAns;
                }else{
                    break;
                }
            }
        }
        System.out.println(Math.round(ans*1000.0)/1000.0);
    }
}
