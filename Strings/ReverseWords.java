package Strings;

public class ReverseWords {
    public static String reverseWordsString(String s){
        StringBuilder ans = new StringBuilder();

        int i=s.length()-1;

        while(i>=0){
            //remove trailing spaces
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }

            int j=i;
            //find the first index of word
            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }

            ans.append(s.substring(j+1,i+1));

            //remove unwanted spaces again in between words
            while(j>=0 && s.charAt(j) == ' '){
                j--;
            }

            //if j is valid index then add space in ans
            if(j>=0){
                ans.append(" ");
            }

            i = j;
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "    My Name     is Tarun   ";
        System.out.println(reverseWordsString(str));
    }
}
