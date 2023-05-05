package HomeWork.April.Section_03;
import java.util.Scanner;
public class p_37 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int osp = n-1;
        int isp = n-2;

        for(int r=1; r<=n; r++){

            for(int csp=1; csp<=osp; csp++)
                System.out.print(" ");

            System.out.print("*");

            for(int csp=1; csp<=isp; csp++){

                if(r==1 || r==n)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }

            System.out.println("*");

            osp--;
        }
    }
}
