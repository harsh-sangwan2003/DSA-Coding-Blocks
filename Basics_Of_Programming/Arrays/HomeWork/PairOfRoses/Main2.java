import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        while(T-->0){

            int n = scn.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++)
                arr[i] = scn.nextInt();

            int tar = scn.nextInt();

            int val1 = -1;
            int val2 = -1;

            for(int i=0; i<arr.length-1; i++){

                int min_diff = Integer.MAX_VALUE;
                for(int j=i+1; j<arr.length; j++){

                    int diff = Math.abs(arr[i]-arr[j]);
                    if(arr[i]+arr[j]==tar && diff<min_diff){

                        val1 = arr[i];
                        val2 = arr[j];
                        min_diff = diff;
                    }
                }
            }

            if(val1<val2)
                System.out.println("Deepak should buy roses whose prices are " + val1 + " and " + val2 + ".");

            else
                System.out.println("Deepak should buy roses whose prices are " + val2 + " and " + val1 + ".");
        }
    }
}
