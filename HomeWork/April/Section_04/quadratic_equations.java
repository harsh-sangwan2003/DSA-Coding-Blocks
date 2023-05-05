import java.util.Scanner;

public class quadratic_equations {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int D = b*b-(4*a*c);
        if(D<0){
            System.out.println("Imaginary");
        }
        else if(D==0){
            System.out.println("Real and Equal");
            int root = -b/(2*a);
            System.out.println(root+" "+root);
        }
        else{
            System.out.println("Real and Distinct");
            int root1 = (-b+(int)Math.sqrt(D))/(2*a);
            int root2 = (-b-(int)Math.sqrt(D))/(2*a);

            if(root1>root2)
                System.out.println(root2+" "+root1);

            else
                System.out.println(root1+" "+root2);
        }
    }
}
