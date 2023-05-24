import java.util.Scanner;

public class factorial {

    public static int calc_fact(int n) {

        if (n == 0 || n == 1)
            return 1;

        int sp = calc_fact(n - 1);
        return sp * n;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = calc_fact(n);
        System.out.println(res);

        scn.close();
    }
}