package Arrays.Day1;

import java.util.ArrayList;

public class Intersection {

    public static ArrayList<Integer> findIntersection(int arr1[],int arr2[]){
        ArrayList<Integer> ansArr = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    ansArr.add(arr2[j]); 
                    arr2[j] = -1;
                }
            }
        }
        
        return ansArr;
    }

    public static void main(String[] args) {
        int arr1[] = {3,3,5,6};
        int arr2[] = {1,2,3,4,5,6};

        ArrayList<Integer> ans = findIntersection(arr1,arr2);

        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
