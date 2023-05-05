package April.Basics_Of_Programming.Arrays.HomeWork.MaximumCircularSum;
import java.util.Scanner;

public class Main {

    public static int maxCircularSum(int[] arr){

        int sum = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE, arraySum = 0;

        for(int i=0; i<arr.length; i++){

            sum += arr[i];
            arraySum += arr[i];

            maxSum = Math.max(sum,maxSum);

            if(sum<0)
                sum = 0;
        }

        sum = 0;
        for(int i=0; i<arr.length; i++){

            sum += arr[i];

            minSum = Math.min(sum,minSum);

            if(sum>0)
                sum = 0;
        }

        return Math.max(maxSum,(arraySum-minSum));

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-->0){

            int n = scn.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<arr.length; i++)
                arr[i] = scn.nextInt();

            int res = maxCircularSum(arr);
            System.out.println(res);
        }
    }
}
