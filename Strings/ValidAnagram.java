package Strings;

public class ValidAnagram {
    public static boolean isValidAnagram(String s,String t){
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            freq[currChar-'a']++;
        }

        for(int i=0;i<t.length();i++){
            char currChar = t.charAt(i);
            if(freq[currChar-'a'] > 0){
                freq[currChar-'a']--;
            }else{
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isValidAnagram(s, t));
    }
}
