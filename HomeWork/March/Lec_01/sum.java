import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = n*(n+1)/2;

        System.out.println(sum);
    }
}
