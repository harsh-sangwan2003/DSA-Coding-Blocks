import java.util.*;

public class checkPrime {
    public static void main(String args[]) {

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