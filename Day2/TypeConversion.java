public class TypeConversion {

    public static void main(String[] args) {
        byte b = 127;
        int a = b;
        System.out.println(b);
        System.out.println(a);

        int a1 = 12;
        byte k = (byte) a1; // casting --> explicit
        System.out.println(a1);
        System.out.println(k);

        int a2 = 12;
        float k1 = (float) a2; // casting
        System.out.println(a2);
        System.out.println(k1);

        byte by1 = 10;
        byte by2 = 20;
        // pramoting the multiplction of two byte number into integer
         int res = by1 * by2;
        System.out.println(res);
    }
}