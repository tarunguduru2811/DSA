public class BitwiseOperations {

    public static boolean evenCheck(int n){
        if( (n & 1) == 0 ){
            return true;
        }else{
            return false;
        }
    }

    public static boolean powerOfTwo(int n){
        if( (n & (n-1)) == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int countSetBit(int n){
        int count = 0;
        while(n != 0){
            if((n&1) != 0){
                count++;
            }

            n = n >> 1;
        }

        return count;
    }

    public static void swapWithoutTemp(int a,int b){
        System.out.println("Before Swap a: " + a + " b: " + b );
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swap a: " + a + " b: " + b );
    }


    public static void main(String[] args) {
        int n = 10;
        int a=10;
        int b=5;

        if(evenCheck(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("Set Bits: " + countSetBit(n));

        System.out.println(n + " is power of 2 " + powerOfTwo(n));

       
        swapWithoutTemp(a, b);
        
    }
}


// //Even
// 0010 & 0001 = 0000
// 0100 & 0001 = 0000

// //Odd
// 0101 & 0001 => 0001
// 0111 & 0001 => 0001