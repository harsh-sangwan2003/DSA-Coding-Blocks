import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=scn.nextInt();
        sortColors(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortColors(int[] nums) {
        // Write your code here
        int i = 0;
        int j = 0;
        int k = nums.length-1;

        while(i<=k){

            if(nums[i]==0){

                swap(nums,i,j);

                i++;
                j++;
            }

            else if(nums[i]==1)
                i++;

            else
            {
                swap(nums,i,k);

                k--;
            }
        }
    }
}