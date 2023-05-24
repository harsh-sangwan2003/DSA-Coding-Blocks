import java.util.Scanner;

public class print_incr_dcr {

    public static void pid(int s, int n) {

        if (s == n) {

            System.out.println(s);
            System.out.println(s);
            return;
        }

        System.out.println(s);
        pid(s + 1, n);
        System.out.println(s);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pid(1, n);

        scn.close();
    }
}