public class array_intro {

    public static void print(int[] arr){

        for(int val: arr)
            System.out.print(val+" ");
 
        System.out.println();
    }

    public static void reversePrint(int[] arr){

        for(int i=arr.length-1; i>=0; i--)
            System.out.print(arr[i]+" ");

        System.out.println();
    }

    public static int Max(int[] arr){

        int max = arr[0];

        for(int val : arr)
        {
            if(val>max)
                max = val;
        }

        return max;
    }

    public static int Find(int[] arr, int target){

        for(int idx=0; idx<arr.length; idx++){

            if(arr[idx]==target)
                return idx;
        }

        return -1;
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
        reversePrint(arr);

        int max_val = Max(arr);
        System.out.println(max_val);

        int idx = Find(arr,30);
        System.out.println(idx);

        reverseArray(arr,0,arr.length-1);
        print(arr);

        rotate(arr,3);
        print(arr);
    }
}
