package Searching;

public class SingleUnique {
    public static int findSingleUniqueElement(int[] arr){
        int n = arr.length;
        int s=0;
        int e= n-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(s==e){
                return arr[s];
            }

            int currentValue = arr[mid];
            int prevValue = -1;
            int nextValue = -1;

            if(mid-1 >=0 ){
                prevValue = arr[mid-1];
            }

            if(mid+1 < n){
                nextValue = arr[mid+1];
            }

            if(currentValue != prevValue && currentValue != nextValue){
                return currentValue;
            }
            if(currentValue != prevValue && currentValue == nextValue){
                int startingIndex = mid;

                if((startingIndex & 1) == 1){
                    //startingIndex -> odd and endindIndex -> even so we are on the right side of ans,we need to move to left
                    e = mid-1;
                }else{
                    //move right
                    s = mid + 1;
                }
            }else if(currentValue != nextValue && currentValue == prevValue){
                 int endingIndex = mid;

                 if((endingIndex & 1) == 1){
                    //endingIndex -> odd and startingIndex -> even so we are on the left side of ans , we need to move right
                    s = mid+1;
                 }else{
                    //move left
                    e = mid-1;
                 }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(findSingleUniqueElement(arr));
    }
}
