package April.Basics_Of_Programming.Arrays.Lec_08;

public class array_demo {

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {1,2,3,4};

        System.out.println(arr1+" "+arr2);
        System.out.println(arr1[0]+" "+arr2[0]);

        swap_in(arr1,arr2,0);
        swap(arr1,arr2);

        System.out.println(arr1[0]+" "+arr2[0]);
        System.out.println(arr1+" "+arr2);
    }

    public static void swap_in(int[] arr1, int[] arr2, int c){

        int d = arr1[c];
        arr1[c] = arr2[c];
        arr2[c] = d;
    }

    public static void swap(int[] arr1, int[] arr2){

        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
    }
}
