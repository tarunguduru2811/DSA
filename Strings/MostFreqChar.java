package Strings;

public class MostFreqChar {
    public static char findMostFreq(String s){
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            int index = currChar - 'a';

            freq[index]++;
        }

        int maxi = -1;
        char ans = 'a';

        for(int i=0;i<26;i++){
            if(freq[i] > maxi){
                maxi = freq[i];
                ans = (char)(i + 'a');
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(findMostFreq(str));
    }
}
