package HomeWork.April.Section_03;
import java.util.Scanner;
public class p_36 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1;
        int count = 1;

        for(int r=1; r<=n; r++){

            for(int cst=1; cst<=nst; cst++)
            {
                System.out.print(count+"\t");
                count++;
            }

            nst++;
            System.out.println();
        }

    }
}
