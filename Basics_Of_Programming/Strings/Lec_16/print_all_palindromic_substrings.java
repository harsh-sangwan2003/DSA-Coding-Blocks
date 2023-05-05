import java.util.Scanner;

public class print_all_palindromic_substrings {

    public static boolean isPalindrome(String str){

        int lo = 0;
        int hi = str.length()-1;

        while(lo<=hi){

            char first = str.charAt(lo);
            char last = str.charAt(hi);

            if(first!=last)
                return false;

            lo++;
            hi--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for(int i=0; i<str.length(); i++){

            for(int j=i+1; j<=str.length(); j++){

                String substring = str.substring(i,j);

                if(isPalindrome(substring))
                    System.out.println(substring);
            }
        }
    }
}
