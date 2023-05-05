import java.util.Scanner;

public class Main2 {

    public static void printArray(int[] arr){

        for(int val : arr)
            System.out.print(val+" ");
    }
    public static int[] squaredArray(int[] arr){

        int l_idx = 0;
        int r_idx = arr.length-1;
        int idx = arr.length-1;
        int[] res = new int[idx+1];

        while(l_idx<=r_idx){

            int leftSquare = arr[l_idx]*arr[l_idx];
            int rightSquare = arr[r_idx]*arr[r_idx];

            if(leftSquare>rightSquare) {
                res[idx--] = leftSquare;
                l_idx++;
            }

            else{
                res[idx--] = rightSquare;
                r_idx--;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int[] res = squaredArray(arr);
        printArray(res);
    }
}
