import java.util.Scanner;
public class typeCasting {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
//        byte b = 127; // implicit type casting
        byte b = (byte)5000; // explicit type casting

        long l = 2000000000000L;

        System.out.println(l);
        System.out.println(b);
    }
}
