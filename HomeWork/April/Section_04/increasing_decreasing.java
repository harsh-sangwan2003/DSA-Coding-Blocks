import java.util.Scanner;

public class increasing_decreasing {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int prev = scn.nextInt();

        int flag = 0; //decreasing

        for(int i=1; i<n; i++){

            int curr = scn.nextInt();

            if(curr==prev){

                System.out.println("false");
                return;
            }

            else if(curr>prev){

                flag = 1;
            }

            else{

                if(flag==1)
                {
                    System.out.println("false");
                    return;
                }

                flag = 0;
            }

            prev = curr;
        }

        System.out.println("true");
    }
}
