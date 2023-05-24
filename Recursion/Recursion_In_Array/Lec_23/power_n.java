import java.util.Scanner;

public class power_n {

    public static int pow(int a, int b) {

        if (b == 0 || a == 1)
            return 1;

        if (b == 1)
            return a;

        int sp = pow(a, b - 1);
        return sp * a;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int res = pow(a, b);
        System.out.println(res);

        scn.close();
    }
}