package April.Basics_Of_Programming.Arrays.Lec_09.RotateArray;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void rotateArray(int[] arr, int rot){

        rot%=arr.length;

        if(rot<0)
            rot+=arr.length;

        for(int r=1; r<=rot; r++){

            int temp = arr[arr.length-1];
            for(int i=arr.length-1; i>=1; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        int rot = scn.nextInt();

        System.out.println(Arrays.toString(arr));
        rotateArray(arr,rot);
        System.out.println(Arrays.toString(arr));
    }
}
