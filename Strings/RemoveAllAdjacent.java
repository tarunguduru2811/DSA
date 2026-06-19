package Strings;

public class RemoveAllAdjacent {
    public static String removeAllAdjacentDuplicates(String s){
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(ans.length()>0 && ans.charAt(ans.length()-1) == s.charAt(i)){
                ans.deleteCharAt(ans.length()-1);
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "azxxzy";
        System.out.println(removeAllAdjacentDuplicates(s));
    }
}
