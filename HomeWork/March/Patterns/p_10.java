import java.util.Scanner;
public class p_10 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 2*n-1;
        int nsp = 0;

        for(int r=1; r<=n; r++){

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            nst-=2;
            nsp++;

            System.out.println();
        }
    }
}
