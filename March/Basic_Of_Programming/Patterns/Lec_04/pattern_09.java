package March.Basic_Of_Programming.Patterns.Lec_04;
import java.util.Scanner;

public class pattern_09 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = n-1;

        for(int row=1; row<=n; row++){

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            System.out.println();

            nst+=2;
            nsp--;
        }
    }
}
