class Calculator {
    int add(int a, int b){
        System.out.println("sum = "+(a+b));
        return 0;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int res = a+b;
        System.out.println(res);
        Calculator c = new Calculator();
        c.add(a, b);
    }
}