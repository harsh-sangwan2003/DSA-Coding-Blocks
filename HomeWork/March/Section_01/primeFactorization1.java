import java.util.*;

public class primeFactorization1 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int div = 2;

        while(n!=1){

            while(n%div==0){

                n = n/div;
                System.out.print(div+" ");
            }
            div++;
        }
    }
}
