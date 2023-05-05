import java.util.Scanner;

public class array_product {
    public static void arrayProduct(long[] arr){

        int countZero = 0;
        long product = 1;

        for(long val : arr){

            if(val!=0)
                product*=val;

            else
                countZero++;
        }

        for(long val : arr){

            if(countZero>=2)
                System.out.print(0+" ");

            else if(countZero==1){

                if(val==0)
                    System.out.print(product+" ");

                else
                    System.out.print(0+" ");
            }

            else{

                System.out.print(product/val+" ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        long[] arr = new long[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextLong();

        arrayProduct(arr);
    }
}