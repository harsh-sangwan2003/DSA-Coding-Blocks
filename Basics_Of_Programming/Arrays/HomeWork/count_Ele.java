package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;

public class count_Ele {

    public static int countElement(int[] arr, int m){

        int count = 0;

        for(int val : arr)
            if(val==m)
                count++;

        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int m = scn.nextInt();

        int count = countElement(arr,m);
        System.out.println(count);
    }
}
