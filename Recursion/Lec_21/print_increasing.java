import java.util.Scanner;

public class print_increasing {

    public static void printIncr(int n) {

        if (n == 0)
            return;

        printIncr(n - 1);
        System.out.println(n);
    }

    public static void printIncr2(int s, int e) {

        if (s == e) {

            System.out.println(s);
            return;
        }

        System.out.println(s);
        printIncr2(s + 1, e);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // printIncr(n);
        printIncr2(1, n);

        scn.close();
    }
}