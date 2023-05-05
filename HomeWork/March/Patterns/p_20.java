package HomeWork.March.Patterns;
import java.util.Scanner;

public class p_20 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int osp = n/2;
        int isp = -1;

        for(int r=1; r<=n; r++){

            for(int csp=1; csp<=osp; csp++)
                System.out.print("  ");

            System.out.print("*"+" ");

            for(int csp=1; csp<=isp; csp++)
                System.out.print("  ");

            if(r!=1 && r!=n)
                System.out.print("*");

            if(r<=n/2){

                osp--;
                isp+=2;
            }

            else{

                osp++;
                isp-=2;
            }

            System.out.println();
        }
    }
}
