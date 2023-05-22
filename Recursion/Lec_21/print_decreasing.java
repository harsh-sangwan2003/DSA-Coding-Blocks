import java.util.Scanner;

public class print_decreasing {

    public static void printDecr(int n) {

        if (n == 0)
            return;

        System.out.println(n);
        printDecr(n - 1);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        printDecr(n);

        scn.close();
    }
}