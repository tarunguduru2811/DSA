package Day4;

import java.util.HashMap;

public class FirstRepeat {
    public static int findFirstRepeating(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i:arr){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }

        for(int i:arr){
            if(freq.get(i) > 1){
                return i;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        int ans = findFirstRepeating(arr);

        System.out.println("First Repeating Element " + ans);
    }
}
