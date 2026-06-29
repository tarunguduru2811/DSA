package Strings;

public class ValidPalindrome {
    public static boolean isValidPalindrome(String s){
        int start = 0;
        int end = s.length()-1;

        s = s.toLowerCase();

        while(start<=end){
            if(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }else if(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else{
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }

                start++;
                end--;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s));
    }
}
