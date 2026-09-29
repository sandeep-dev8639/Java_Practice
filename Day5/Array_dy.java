public class Array_dy {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println(arr[0]); // defalut value of int is " 0 "


        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        for(int i=0; i<arr.length; i++) // arr.length  is give array length
        {
            System.out.println("arr[" + i + "]" + "=" + arr[i]);
        }

    }    
}
