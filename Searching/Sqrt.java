package Searching;

public class Sqrt {
    public static int findSqrt(int x){
        
        int s=1;
        int e=x;
        int ans=-1;

        //To handle the case of divide by zero exception and starting from 1
        if(x==0){
            return 0;
        }

        while(s<=e){
            int mid = s+(e-s)/2;
            // To handle the case for large no. which can lead mid*mid to overflow 
            // so we are using as divide in conditions
            
            if(mid == x/mid){
                return mid;
            }else if(mid > x/mid){
                //left
                e=mid-1;
            }else{
                //right
                ans=mid;
                s=mid+1;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        int x = 56;
        int decimalPrecision = 3;
        double ans = findSqrt(x);
        double factor = 1;
        
        
        for(int round=1;round<=decimalPrecision;round++){
            factor = factor/10;
            double newAns = ans;

            for(int i=1;i<=10;i++){
                newAns = newAns + factor;
                if(newAns*newAns < x){
                    ans = newAns;
                }else{
                    break;
                }
            }
        }

        System.out.println(Math.round(ans*1000.0)/1000.0);
    }
}
