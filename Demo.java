public class Demo {

    public static boolean evenCheck(int n){
        if( (n & 1) == 0 ){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        int n = 16;
        
        if(evenCheck(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        int count = 0;

        while(n != 0){
            if((n & 1) != 0){
                count++;
            }

            n = n>>1;
        }

        System.out.println("Set Bits: "+ count);
    }
}


// //Even
// 0010 & 0001 = 0000
// 0100 & 0001 = 0000

// //Odd
// 0101 & 0001 => 0001
// 0111 & 0001 => 0001