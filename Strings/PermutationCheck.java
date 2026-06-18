package Strings;

public class PermutationCheck {

    public static boolean compareFreq(int[] count1,int[] count2){
        for(int i=0;i<26;i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }

        return true;
    }

    public static boolean checkPermutation(String s1,String s2){
        //algo
        //create s1 ka freq ka table
        //create s2 ka freq ka table for first window
        //check freq tables of both s1 and s2
        //if equal return true else repeat the process for remaining window


        if(s1.length() > s2.length()){
            return false;
        }

        int[] count1 = new int[26];

        for(int i=0;i<s1.length();i++){
            char currChar = s1.charAt(i);
            int currCharIndex = currChar - 'a';
            count1[currCharIndex]++;
        }

        int i=0;
        int windowLength = s1.length();
        int[] count2 = new int[26];

        for(i=0;i<windowLength;i++){
            int currChar = s2.charAt(i);
            int currCharIndex = currChar - 'a';
            count2[currCharIndex]++;
        }

        if(compareFreq(count1, count2) == true){
            return true;
        }else{
            while(i<s2.length()){
                //remove old char and add new char
                char newChar = s2.charAt(i);
                int newCharIndex = newChar - 'a';
                count2[newCharIndex]++;

                int oldCharIndex = i - windowLength;
                char oldChar = s2.charAt(oldCharIndex);
                int freqIndexOfOldChar = oldChar - 'a';
                count2[freqIndexOfOldChar]--; 
                
                if(compareFreq(count1, count2) == true){
                    return true;
                }

                i++;

            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkPermutation(s1, s2));
    }
}
