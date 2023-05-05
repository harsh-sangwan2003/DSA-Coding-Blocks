package HomeWork.April.Section_04.Conversions;
import java.util.Scanner;
public class decimalToOctal {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int x = 8;
        while(x<=num)
            x*=8;

        x/=8;
        int res = 0;

        while(x>0){

            int ld = num/x;
            num -= x*ld;

            res = res*10+ld;
            x/=8;
        }

        System.out.println(res);
    }
}
