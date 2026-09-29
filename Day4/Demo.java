
class addition{
    int add(int a, int b){
        
        return a+b;
    }
}
public class Demo {
    public static void main(String[] args) {
        addition obj = new addition();
        int r1 = obj.add(10, 20);
        System.out.println(r1);
    }
    
}
