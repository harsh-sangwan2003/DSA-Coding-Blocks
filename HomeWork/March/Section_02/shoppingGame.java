import java.util.Scanner;
public class shoppingGame {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String flag = "";

        for(int i=1; i<=n; i++){

            int Aayush = scn.nextInt();
            int Harshit = scn.nextInt();

            int odd = 1;
            int even = 2;

            while(true){

                if(Aayush-odd<0)
                {
                    flag = "Harshit";
                    break;
                }

                if(Harshit-even<0)
                {
                    flag = "Aayush";
                    break;
                }

                Aayush-=odd;
                Harshit-=even;

                odd+=2;
                even+=2;
            }

            System.out.println(flag);

        }
    }
}
