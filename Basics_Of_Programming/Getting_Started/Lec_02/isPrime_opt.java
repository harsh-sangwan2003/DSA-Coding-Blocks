package March.Basic_Of_Programming.Getting_Started.Lec_02;
import java.util.Scanner;

public class isPrime_opt {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int div = 2;
        boolean flag = true;
        while(div<num/div){

            if(num%div==0){
                flag = false;
                break;
            }

            div++;
        }

        if(flag){
            System.out.println("Prime");
        }

        else{
            System.out.println("Not Prime");
        }
    }
}
