package HomeWork.April.Section_04.Conversions;
import java.util.Scanner;

public class anyToAny {


    public static int srcToDecimal(int num, int sb){

        int res = 0;
        int x = 1;

        while(num!=0){

            int ld = num%10;
            num/=10;

            res += ld*x;
            x*=sb;
        }

        return res;
    }

    public static int decimalToDest(int num, int db){

        int res = 0;
        int x = db;

        while(x<=num)
            x*=db;

        x/=db;

        while(x>0){

            int ld = num/x;
            num -= x*ld;

            res = res*10 + ld;
            x/=db;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int sb = scn.nextInt();
        int db = scn.nextInt();
        int num = scn.nextInt();

        int res1 = srcToDecimal(num,sb);
        int ans = decimalToDest(res1,db);

        System.out.println(ans);
    }
}
