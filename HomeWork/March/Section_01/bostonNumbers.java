package HomeWork.March.Section_01;
import java.util.*;

public class bostonNumbers {

    public static int sum_of_digits(int n){

        int sum = 0;

        while(n!=0){

            int lastDigit = n%10;
            n/=10;
            sum += lastDigit;
        }

        return sum;
    }

    public static int factor(int n){

        int sum = 0;

        for(int div=2; div*div<=n; div++){

            while(n%div==0){

                n/=div;

                if(div>=10)
                    div = sum_of_digits(div);

                sum+=div;
            }
        }

        if(n!=1)
        {
            if(n>=10)
                n = sum_of_digits(n);

            sum+=n;
        }

        return sum;
    }

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sod = sum_of_digits(n);
        int factorsSum = factor(n);

        if(sod==factorsSum)
            System.out.println(1);

        else
            System.out.println(0);
    }
}