import java.util.Scanner;

public class coin {

    public static void sol(int n, String str) {

        if (n == 0) {

            System.out.println(str);
            return;
        }

        sol(n - 1, str + "H");
        sol(n - 1, str + "T");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        sol(n, "");

        scn.close();
    }
}