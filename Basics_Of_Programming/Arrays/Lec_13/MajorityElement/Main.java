import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int majorityEle(int[] arr){

        Arrays.sort(arr);

        int mid = arr.length/2;
        return arr[mid];
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int res = majorityEle(arr);
        System.out.println(res);
    }
}
