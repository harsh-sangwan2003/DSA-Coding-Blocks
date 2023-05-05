package April.Basics_Of_Programming.Strings.Lec_15;

public class string_demo {

    public static void main(String[] args) {

        String str = "hello baaji ello ello";

        System.out.println(str.length());

        System.out.println(str.charAt(1));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(7));

        System.out.println(str.indexOf("ello"));
        System.out.println(str.lastIndexOf("ello"));
        System.out.println(str.startsWith("hell"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.substring(0,3));
    }
}
