import java.util.Scanner;

public class p_29 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = n-1;
        int count = 1;

        for(int r=1; r<=n; r++){

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            count = r;
            for(int cst=1; cst<=nst; cst++){

                if(cst==1 || cst==nst)
                    System.out.print(count+" ");

                else
                    System.out.print(0+" ");
            }

            nst+=2;
            nsp--;

            System.out.println();
        }
    }
}
