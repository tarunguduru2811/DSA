package Arrays.SelfPractise;

public class MergeTwoSorted {

    public static void mergeTwoSortedArrays(int arr1[],int m,int arr2[],int n){
        int i=0;
        int j=0;
        int k=0;

        int[] ans = new int[m+n];

        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                ans[k++] = arr1[i++];
            }else{
                ans[k++] = arr2[j++];
            }
        }

        while(i<m){
            ans[k++] = arr1[i++];
        }

        while (j<n) {
            ans[k++] = arr2[j++];
        }

        for(int l=0;l<ans.length;l++){
            arr1[l] = ans[l];
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] ={2,5,6};
        int m=3;
        int n=3;
        mergeTwoSortedArrays(arr1, m, arr2, n);

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

    }
}
