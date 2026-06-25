package Recursion;

public class PrintName {
    public static void printName(int i){
        //Base Case
        if(i>5){
            return;
        }

        //1 case solve kardo -> processing
        System.out.println("Tarun");
        
        //Recursion call
        printName(i+1);
    }
    public static void main(String[] args) {
        int i=1;
        printName(i);        
    }    
}
