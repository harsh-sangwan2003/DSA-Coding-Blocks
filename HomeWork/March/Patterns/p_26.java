import java.util.Scanner;

public class p_26 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int nsp = n-1;
        int count = 1;

        for(int r=1; r<=n; r++){

            for(int csp=1; csp<=nsp; csp++)
                System.out.print("  ");

            for(int cst=1; cst<=nst; cst++){

                System.out.print(count+" ");
                count++;
            }

            nst+=2;
            nsp--;
            count = 1;

            System.out.println();
        }
    }
}
