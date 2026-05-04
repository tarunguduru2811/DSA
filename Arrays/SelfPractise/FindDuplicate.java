package Arrays.SelfPractise;

public class FindDuplicate {

    public static int findDuplicateNumber(int arr[]){
        for(int i=0;i<arr.length;i++){
            int idx = Math.abs(arr[i]);

            if (arr[idx] < 0) {
                return idx;
            }

            arr[idx] *= -1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2,2};

        int ans = findDuplicateNumber(arr);
        System.out.println(ans);

    }
}
