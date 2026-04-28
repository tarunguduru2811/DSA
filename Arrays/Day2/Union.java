package Arrays.Day2;

import java.util.ArrayList;

public class Union {

    static ArrayList<Integer> findUnion(int arr1[],int arr2[]){
        ArrayList<Integer> ls = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            if(!ls.contains(arr1[i])){
                ls.add(arr1[i]);
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(!ls.contains(arr2[i])){
                ls.add(arr2[i]);
            }
        }

        return ls;
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {3,3,4,7,8,9};

        ArrayList<Integer> ans = findUnion(arr1, arr2);

        for(int i:ans){
            System.out.print(i + " ");
        }
        
    }
}
