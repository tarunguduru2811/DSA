package Arrays.Day2;

import java.util.HashMap;

public class HighAndLowFreq {
    public static int[] HighAndLowFreq(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i:arr){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int lowFreq = Integer.MAX_VALUE;
        int maxFreqKey = -1;
        int lowFreqKey = -1;

        for(int i:freq.keySet()){
            int currentFreq = freq.get(i);

            if(currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxFreqKey = i;
            }

            if(currentFreq < lowFreq){
                lowFreq = currentFreq;
                lowFreqKey = i;
            }
        }

        int[] ans = {lowFreqKey,maxFreqKey};

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,4,4,4,5,5,5,5,5};
        int ans[] = HighAndLowFreq(arr);

        System.out.println("Max Freq Element: " + ans[1]);
        System.out.println("Low Freq Element: " + ans[0]);
    }
}
