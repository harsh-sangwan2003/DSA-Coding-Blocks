package April.Basics_Of_Programming.Arrays.HomeWork;
import java.util.Scanner;

public class alex_goes_shopping {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int q = scn.nextInt();
        while(q-->0){

            int A = scn.nextInt();
            int k = scn.nextInt();

            int count = 0;
            for(int i=0; i<arr.length; i++){

                if(A%arr[i]==0)
                    count++;
            }

            if(k<=count)
                System.out.println("Yes");

            else
                System.out.println("No");
        }
    }
}
