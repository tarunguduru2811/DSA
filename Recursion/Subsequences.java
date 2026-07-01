package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsequences {
   
    public static void getAllSubsequences(String s,int index,StringBuilder output,List<String> ans){
        //Base Case
        if(index >= s.length()){
            String subsequence = output.toString();
            ans.add(subsequence);
            return;
        }

        //1 case solve kardo
        //include 
        char ch = s.charAt(index);
        output.append(ch);
        getAllSubsequences(s, index+1, output, ans);
        //exclue
        output.deleteCharAt(output.length()-1);
        getAllSubsequences(s, index+1, output, ans);

    }
    public static void main(String[] args) {
      String s = "abc";
      int index = 0;
      StringBuilder output = new StringBuilder();
      List<String> ans = new ArrayList<>();
      getAllSubsequences(s, index, output, ans);
      Collections.sort(ans);
      for(String p:ans){
        System.out.print(p + " ");
      }

   }
}
