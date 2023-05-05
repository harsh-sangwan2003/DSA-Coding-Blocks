package HomeWork.April.Section_04;
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);

        while(ch!='X' && ch!='x'){

            if(ch=='+'){

                int num1 = scn.nextInt();
                int num2 = scn.nextInt();
                System.out.println(num1+num2);
            }

            else if(ch=='*'){

                int num1 = scn.nextInt();
                int num2 = scn.nextInt();
                System.out.println(num1*num2);
            }

            else if(ch=='/'){

                int num1 = scn.nextInt();
                int num2 = scn.nextInt();
                System.out.println(num1/num2);
            }

            else if(ch=='-'){

                int num1 = scn.nextInt();
                int num2 = scn.nextInt();
                System.out.println(num1-num2);
            }

            else if(ch=='%'){

                int num1 = scn.nextInt();
                int num2 = scn.nextInt();
                System.out.println(num1%num2);
            }

            else{

                System.out.println("Invalid operation. Try again.");
            }

            ch = scn.next().charAt(0);
        }
    }
}
