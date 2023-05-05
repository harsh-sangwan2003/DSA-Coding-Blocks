import java.util.Arrays;
import java.util.Scanner;

public class count_sort {

    public static void countSort(int[] arr){

        
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
