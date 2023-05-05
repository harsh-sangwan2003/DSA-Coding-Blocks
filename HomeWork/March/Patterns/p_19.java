import java.util.Scanner;

public class p_19 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = n/2;
        int nsp = -1;

        for(int r=1; r<=n; r++){

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            for(int cst=1; cst<=nst; cst++)
                System.out.print("*"+" ");

            if(r==1 || r==n)
            {
                System.out.print("*");
                nst = n/2+1;
            }

            if(r<=n/2){

                nst--;
                nsp+=2;
            }

            else{

                nst++;
                nsp-=2;

                if(r==n-1)
                    nst=n/2;
            }

            System.out.println();
        }
    }
}
