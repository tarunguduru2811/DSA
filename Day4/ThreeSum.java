package Day4;

import java.util.*;

public class ThreeSum {
    //target is 0 already given
    public static List<List<Integer>> findThreeSum(int arr[]){

        Set<List<Integer>> st = new HashSet<>();

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> result = new ArrayList<>();
                        result.add(arr[i]);
                        result.add(arr[j]);
                        result.add(arr[k]);
                        Collections.sort(result);
                        st.add(result);
                    }
                }
            }
        }


        return  new ArrayList<>(st);
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = findThreeSum(arr);

        System.out.println(ans);

    }
}
