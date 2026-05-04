package Arrays.Day4;

public class RemoveDuplicates {

    public static int lengthAfterRemoveDuplicatesSortedArray(int arr[]){
        int i=0;
        int j=1;

        while(j<arr.length){
            //i tak saare unique elements hai,agar previous vala same nhi hai tho wo unique hi hoga that's why inc. i;
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                j++;
            }else{
                j++;
            }
        }

        return i+1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,5,5};
        int ans = lengthAfterRemoveDuplicatesSortedArray(arr);
        System.out.println(ans);
    }
}
