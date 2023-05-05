package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;

public class linearSearch {

    public static int linear(int[] arr, int m){

        for(int i=0; i<arr.length; i++)
            if(arr[i]==m)
                return i;

        return -1;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int m = scn.nextInt();
        int idx = linear(arr,m);

        System.out.println(idx);
    }
}
