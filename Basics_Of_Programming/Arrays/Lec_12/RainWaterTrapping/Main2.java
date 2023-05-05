import java.util.Scanner;

public class Main2 {
    public static int rainWaterTrapping(int[] arr){

        return 1;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        for(int t=1; t<=T; t++){

            int n = scn.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++)
                arr[i] = scn.nextInt();

            int res = rainWaterTrapping(arr);
            System.out.println(res);
        }
    }
}