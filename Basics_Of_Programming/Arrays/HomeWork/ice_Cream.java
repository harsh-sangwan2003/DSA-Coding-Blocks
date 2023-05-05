package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;

public class ice_Cream {

    public static int findDessert(int[] arr){

        int order = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min){

                min = arr[i];
                order = i+1;
            }
        }

        return order;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int order = findDessert(arr);
        System.out.println(order);
    }
}
