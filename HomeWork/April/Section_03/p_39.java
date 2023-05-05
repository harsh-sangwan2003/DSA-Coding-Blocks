package HomeWork.April.Section_03;
import java.util.Scanner;
public class p_39 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int a = 0;
        int b = 1;

        for(int r=1; r<=n; r++){

            for(int cst=1; cst<=nst; cst++){

                System.out.print(a+" ");

                int c = a+b;
                a = b;
                b = c;
            }

            nst++;
            System.out.println();
        }

    }
}
