package HomeWork.March.Patterns;
import java.util.Scanner;
public class p_11 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = n-1;

        for(int r=1; r<=n; r++){

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            for(int cst=1; cst<=nst; cst++)
            {
                if(cst%2==0)
                    System.out.print("  ");

                else
                    System.out.print("*"+" ");
            }

            nst+=2;
            nsp--;

            System.out.println();
        }
    }
}
