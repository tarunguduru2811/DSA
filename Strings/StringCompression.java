package Strings;

public class StringCompression {
   public static int compressString(char chars[]){
      int readIndex = 0;
      int writeIndex = 0;

      while(readIndex < chars.length){
         char currChar = chars[readIndex];
         int count = 0;
         while(readIndex < chars.length && chars[readIndex] == currChar) {
            readIndex++;
            count++;
         }

         chars[writeIndex] = currChar;
         writeIndex++;

         if(count > 1){
            String countStr = String.valueOf(count);
            for(char c:countStr.toCharArray()){
               chars[writeIndex] = c;
               writeIndex++;
            }
         }
      }

      return writeIndex;
   }
   public static void main(String[] args) {
      char chars[] = {'a','a','b','b','b','c','c'};  
      System.out.println(compressString(chars));  
      for(char c:chars){
         System.out.print(c+" ");
      }
   }
}
