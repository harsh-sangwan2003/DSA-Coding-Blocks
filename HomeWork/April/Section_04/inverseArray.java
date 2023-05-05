package HomeWork.April.Section_04;
import java.util.Scanner;
public class inverseArray {

    public static void inverseArr(int[] arr){

        for(int i=0; i<arr.length; i++){

            arr[arr[i]] = i;
        }
    }

    public static void printArray(int[] arr){

        for(int val: arr)
            System.out.print(val+" ");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();

        inverseArr(arr);
        printArray(arr);
    }
}
