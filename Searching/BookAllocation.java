package Searching;

public class BookAllocation {
    public static boolean isValidAnswer(int maxPages,int[] arr,int k){
        int studentCount = 1;
        int pages = 0;

        for(int i=0;i<arr.length;i++){
            if(pages+arr[i] <= maxPages){
                pages = pages + arr[i];
            }else{
                studentCount++;
                if(studentCount > k || maxPages < arr[i]){
                    return false;
                }else{
                    pages=0;
                    pages = pages + arr[i];
                }
                
            }
        }

        return true;
    }
    public static int allocateBooks(int[] arr,int k){
        int ans = -1;
        int sum=0;  
        for(int val:arr){
            sum += val;
        }

        int s=1;
        int e=sum;

         //if we have less students than the no. of books we cannot distribute
        if(arr.length < k){
            return -1;
        }

        while(s<=e){
            int mid = s+(e-s)/2;

            if(isValidAnswer(mid,arr,k)){
                ans = mid;
                //move left
                e=mid-1;
            }else{
                //move right
                s=mid+1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        //Allocate the books to the students such that it should be 
        //minimum of the maximum pages that a student to be read.
        int[] books = {12,34,67,90};
        int k = 2;
        System.out.println(allocateBooks(books, k));
    }
}


//Example -> 10,20,30,40,50 , k = 2

// 1 - 150 
// s=1 , e=150 , mid => 75 -> isPossible(75) -> not possible so move right
//s=76 , e=150 , mid => 113 -> isPossible(113) -> yes -> so move left and store ans = 113
//s=76 , e=112, mid => 94 -> isPossible(94) -> yes -> so move left and ans = 94
//s=76 , e=93 , mid => 84 -> isPossible(84) -> not -> so move right
//s=85 , e=93 , mid => 89 -> isPossible(89) -> not -> so move right
//s=90 , e=93, mid => 91 -> isPossible(91) -> yes -> so move left and ans=91
//s=90,e=90, mid=> 90 -> isPossible(90) -> yes -> so move left and ans = 90
//s=90, e=89 -> s>e -> not possible

//so the answer = 90 which means the minimum of the maximum pages that student needs to be read is 90 pages