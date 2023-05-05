package HomeWork.March.Patterns;
import java.util.Scanner;
public class p_07 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int r=1; r<=n; r++){

            for(int col=1; col<=n; col++)
            {
                if(r==1 || col==1 || r==n || col==n)
                    System.out.print("*"+" ");

                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}
