package Arrays.Day2;

import java.util.HashMap;

public class Mode {

    static int findMode(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i:arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for(int i:freq.keySet()){
            System.out.println(i + "->" + freq.get(i));
        }

        int maxFreq = -1;
        int maxFreqKey = -1;

        for(int i:freq.keySet()){
            int currentFreq = freq.get(i);

            if(currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxFreqKey = i;
            }
        }

        return maxFreqKey;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,4,4,5};
        System.out.println(findMode(arr));
    }

}


// 1 -> 1
// 2 -> 1

// maxFreq = n/3 => 2/3 = 0;
