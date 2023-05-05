public class rotate_array {

    public static void print(int[] arr){

        for(int val: arr)
            System.out.print(val+" ");

        System.out.println();
    }

    public static void reverseArray(int[] arr, int lo, int hi){

        while(lo<=hi){

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }

    public static void rotate(int[] arr, int rot){

        if(rot<0)
            rot+=arr.length;

        rot%=arr.length;

        reverseArray(arr,0,arr.length-rot-1);
        reverseArray(arr,arr.length-rot,arr.length-1);
        reverseArray(arr,0,arr.length-1);
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        print(arr);

        rotate(arr,3);
        print(arr);
    }
}
