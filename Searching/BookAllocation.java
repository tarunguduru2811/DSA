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


// [12, 34, 67, 90]
// s = 1
// e = 203 
// mid = 102 

// isValid -> student 1 -> 12 , 34
//            studen 2 -> 67 , 90 -> Not Valid , which means that we are not able to distribute the books 
//                                   which means that with less number we are not able to satisfy of distribution
//                                   so move right
                                  
                                  
// s = 103 
// e = 203 
// mid = 153

// isValid -> student 1 -> 12, 34 , 67 
//            student 2 -> 90  -> It is a valid solution and can be potential answer,Now we can able to satisfy 
//                                with more that this number and we also want to get the min of max,so move left
//                                ans = 153
                               

// s = 103 
// e = 152
// mid = 127

// isValid -> student 1 -> 12,34, 67 <=127
//            student 2 -> 90 <= 127 -> It is valid,so ans = 127 
           
           
// s = 103
// e = 126
// mid = 114 

// isValid -> student 1 -> 12,32,67 <= 114
//            student 2 -> 90 <= 114 -> It is valid,so ans = 114
           
           
// s = 103
// e = 113
// mid = 108 

// isValid -> student 1 -> 12,34 <= 108
//            student 2 -> 67,90 -> Not Valid 
           
           
// s = 109 
// e = 113
// mid = 111

// isValid -> student 1 -> 12,34 <= 108
//             student 2 -> 67,90 -> Not valid


// s = 112
// e = 113
// mid = 112

// isValid -> student 1 -> 12,34 <= 112
//            student 2 -> 67,90 -> Not Valid
           
// s = 113
// e = 113 
// mid = 113

// isValid -> student 1 -> 12,34,67 <= 113
//            student 2 -> 90 <= 113 -> Valid , ans = 113 
           
// s = 113 
// e = 112 
// s <= e -> Stop Execution and return ans = 113 

// 113 is the max pages that a student read which is min of all possible cases
