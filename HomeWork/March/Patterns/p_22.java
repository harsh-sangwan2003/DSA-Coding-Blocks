import java.util.Scanner;

public class p_22 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = n-1;
        int nsp = -1;

        for(int r=1; r<=n; r++){

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            if(r==1)
                System.out.print("*"+" ");

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            if(r==1){
                nst=n;
            }

            nst--;
            nsp+=2;

            System.out.println();
        }
    }
}
