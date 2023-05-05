package April.Basics_Of_Programming.ArrayList.Lec_17;

import java.util.ArrayList;

public class arrayList_demo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        System.out.println(list);

        list.add(20);
        System.out.println(list);

        list.add(30);
        System.out.println(list);

        list.add(40);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        int x = list.get(0);
        System.out.println(x);

        list.set(2,2000);
        System.out.println(list);

        list.add(1,5);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}
