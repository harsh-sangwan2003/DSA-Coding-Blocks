import java.util.Scanner;

public class max_Value {

    public static int findMax(int[] arr){

        int max = arr[0];

        for(int val : arr)
            if(val>max)
                max = val;

        return max;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int maxValue = findMax(arr);
        System.out.println(maxValue);
    }
}
