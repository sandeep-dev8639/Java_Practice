class Calculate {
    void add(int a, int b) {
        System.out.println("sum = " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("sum = " + (a + b + c));
    }
}

public class MethodOverloding {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.add(10, 20);
        c.add(10, 20, 30);
    }
}