package Strings;

public class RemoveAllOccurences {
    public static String removeAllOccurencesofPart(String s,String part){
        int m = part.length();

        while(s.contains(part)){
            int firstIndexofPart = s.indexOf(part);
            s = s.substring(0,firstIndexofPart) + s.substring(firstIndexofPart+m,s.length());    
        }

        return s;
    }
    public static void main(String[] args) {
        String s = "axxxxyyyyb";
        String part = "xy";
        System.out.println(removeAllOccurencesofPart(s, part));
    }
}
