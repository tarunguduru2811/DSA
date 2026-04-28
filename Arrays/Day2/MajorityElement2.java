package Arrays.Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    //This question states that return all the elements whose freq is more than n / 3
    
    public static List<Integer> findmajorityElement(int[] nums) {
         HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i:nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        // for(int i:freq.keySet()){
        //     System.out.println(i + "->" + freq.get(i));
        // }

        int maxFreq = nums.length / 3;
        List<Integer> ls = new ArrayList<>();
        System.out.println("Max Freq " + maxFreq );
        for(int i:freq.keySet()){
            int currentFreq = freq.get(i);
            System.out.println("Current Freq " + currentFreq);
            if(currentFreq > maxFreq){
                //maxFreq = currentFreq;
                ls.add(i);
            }
        }

        return ls; 
   }
    public static void main(String[] args) {
        int arr[] = {1,2};
        List<Integer> ls = findmajorityElement(arr);
        System.out.println(ls);
    }
}
