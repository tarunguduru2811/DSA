package Arrays.Day3;

public class UniqueElement {

    static int findUnique(int arr[]){
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            ans = ans^arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,5,4,6,5,1,6};
        int ans = findUnique(arr);
        System.out.println(ans);
    }
}
