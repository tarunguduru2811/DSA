package Arrays.SelfPractise;

import java.util.ArrayList;
import java.util.Collections;

public class AddArrays {
    // {1,2,3};
    // {1,2,4,5};

    public static String addTwoArrays(int arr1[],int arr2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=arr1.length-1;
        int j=arr2.length -1;
        int carry = 0;

        while(i >= 0 && j >= 0){
            int digit = arr1[i] + arr2[j] + carry;
            int x = digit % 10;
            carry = digit / 10;
            ans.add(x);
            i--;
            j--;
        }

        while(i >= 0){
            int digit = arr1[i] + 0 + carry;
            int x = digit % 10;
            carry = digit / 10;
            ans.add(x);
            i--;
        }

         while(j >= 0){
            int digit = 0 + arr2[j] + carry;
            int x = digit % 10;
            carry = digit / 10;
            ans.add(x);
            j--;
        }

        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);

        String result = ans.toString();

        return result;
    }
    public static void main(String[] args) {
        int arr1[] = {9,9};
        int arr2[] = {9,1};
        String ans = addTwoArrays(arr1,arr2);
        System.out.println(ans);

    }
}
