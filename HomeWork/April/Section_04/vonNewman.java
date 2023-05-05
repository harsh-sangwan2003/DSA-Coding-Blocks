package HomeWork.April.Section_04;
import java.util.Scanner;

public class vonNewman {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n-->0){

            int num = scn.nextInt();
            int mul = 1;
            int res = 0;

            while(num!=0){

                int ld = num%10;
                num/=10;

                res += ld*mul;
                mul*=2;
            }

            System.out.println(res);
        }
    }
}
