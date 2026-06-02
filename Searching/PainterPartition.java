package Searching;

public class PainterPartition {
    public static boolean isValidAnswer(int maxPainted,int[] arr,int k){
        int paintersCount = 1;
        int paintedBoard = 0;

        for(int i=0;i<arr.length;i++){
            if(paintedBoard + arr[i] <= maxPainted){
                paintedBoard += arr[i];
            }else{
                paintersCount++;

                if(paintersCount > k || maxPainted < arr[i]){
                    return false;
                }else{
                    paintedBoard=0;
                    paintedBoard += arr[i];
                }
            }
        }

        return true;
    }
    public static int findMinTime(int[] arr,int k){
        int sum=0;
        for(int val:arr){
            sum += val;
        }

        int s=1;
        int e=sum;
        int ans=-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(isValidAnswer(mid,arr,k)){
                ans = mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 15};
        int k=3;
        System.out.println(findMinTime(arr, k));

    }
}



// [5, 10, 30, 20, 15], k = 3


// s = 1
// e = 80 

// mid = 40 

// isValid -> painter 1 -> 5,10 <= 40
//           painter 2 -> 30 <= 40
//           painter 3 -> 20.15 <= 40
//         -> It is valid,so it can be a potential answer and as we know that if we are able to 
//             paint the board in 40 units then it is obvious that we can paint in more than 40 units
//             of time also and we need to find the min time,so move left and store ans = 40
            
// s = 1
// e = 39
// mid = 20 

// isValid -> painter 1  -> 5,10 <= 20
//           painter 2 -> 30 -> not able to allocate
//         -> It is not valid,so it means that we are not able paint all the board within 20 units,
//           which means that we cannot paint in less time units so move right
           

// s = 21
// e = 39
// mid = 30 

// isValid -> painter 1 -> 5,10
//           painter 2 -> 30 
//           painter 3 -> 20,15 -> not valid , move right
           
           
// s = 31
// e = 39 
// mid = 35

// isValid -> painter 1 -> 5,10
//           painter 2 -> 30 
//           painter 3 -> 20,15 -> valid ,ans = 35 and move left
           
           
// s = 31
// e = 34
// mid = 32

// isValid -> painter 1 -> 5,10
//             painter 2 -> 30
//             painter 3 -> 20,15 -> not valid  so move right
            
// s = 33
// e = 34
// mid = 33

// isValid -> painter 1 -> 5,10
//             painter 2 -> 30
//             painter 3 -> 20,15 -> not valid
            
            
// s = 34
// e = 34
// mid = 34

// isValid -> not valid -> move right


// s = 35
// e = 34 

// s<= e -> stop execution and return ans = 35