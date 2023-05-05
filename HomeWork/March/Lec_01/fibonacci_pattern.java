import java.util.Scanner;

public class fibonacci_pattern {

    public static int fib(int n){

        if(n==0 || n==1)
            return n;

        int a = 0;
        int b = 1;

        for(int i=1; i<=n; i++){

            int c = a+b;
            a = b;
            b = c;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = fib(n);
        System.out.println(res);
    }
}
