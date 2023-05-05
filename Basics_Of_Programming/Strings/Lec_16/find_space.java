package April.Basics_Of_Programming.Strings.Lec_15;

public class find_space {

    public static int find(String str, char ch){

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)==ch)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        String str = "hello baaji";

        int ans = find(str,' ');
        System.out.println(ans);

        System.out.println(str.indexOf("ello"));
        System.out.println(str.lastIndexOf("ello"));
        System.out.println(str.startsWith("hell"));
        System.out.println(str.endsWith("lo"));

    }
}
