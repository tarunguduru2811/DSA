package Searching;

public class ROTI_PRATA {

    public static boolean isValid(int totalParantha, int l ,int[] ranks,int timeLimit){
        int parantaCount = 0;
        

        for(int i=0;i<ranks.length;i++){
            int currentCookRank = ranks[i];
            int timeTaken = 0;
            int j=1;

            while(timeTaken <= timeLimit){
                if(timeTaken + currentCookRank*j <= timeLimit){
                    timeTaken += currentCookRank*j ;
                    parantaCount++;
                    j++;
                    
                }else{
                    break;
                }
            }

            if(parantaCount >= totalParantha){
                return true;
            }
        }

        if(parantaCount >= totalParantha){
            return true;
        }else{
            return false;
        }

        
    }

    public static int findMinTimeforCookingPrata(int n,int l,int[] ranks){
        int ans = -1;
        int maxi = -1;

        for(int val:ranks){
            if(val > maxi){
                maxi = val;
            }
        }
        
        int s = 0;
        int e = maxi * (n * (n+1)/2);


        while(s<=e){
            int mid = s+(e-s)/2;

            if(isValid(n,l,ranks,mid)){
                //store ans and move left
                ans = mid;
                e = mid-1;
            }else{
                //move right
                s = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        // 8
        // 1 1
        int n = 8;
        int NoCooks = 8;
        int[] ranks = {1,1,1,1,1,1,1,1};

        System.out.println(findMinTimeforCookingPrata(n, NoCooks, ranks));
    }
}


