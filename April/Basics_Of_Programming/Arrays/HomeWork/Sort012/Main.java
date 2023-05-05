package April.Basics_Of_Programming.Arrays.HomeWork.Sort012;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortColors(int[] nums) {
        // Write your code here
        int count_0 = 0;
        int count_1 = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i]==0)
                count_0++;

            else if(nums[i]==1)
                count_1++;
        }

        int count_2 = nums.length - (count_0+count_1);

        int idx = 0;
        while(idx<nums.length && count_0!=0){

            nums[idx] = 0;
            idx++;
            count_0--;
        }

        while(idx<nums.length && count_1!=0){

            nums[idx] = 1;
            idx++;
            count_1--;
        }

        while(idx<nums.length && count_2!=0){

            nums[idx] = 2;
            idx++;
            count_2--;
        }

    }
}