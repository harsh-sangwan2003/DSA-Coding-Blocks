import java.util.Scanner;

public class p_21 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = 2*n-3;

        for(int r=1; r<=n; r++){

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            if(r==n)
                System.out.print("*"+" ");

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            if(r!=n-1){
                nst++;
                nsp-=2;
            }

            else{
                nsp-=2;
            }

            System.out.println();
        }
    }
}
