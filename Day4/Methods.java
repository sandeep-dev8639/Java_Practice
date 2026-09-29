class Computer{
    public void cpu(){
        System.out.println("CPU is running");
    }

    public int memory(int a){
        System.out.println("no of memory:"+a);
        return a;
    }

    public void vote(int age){
        if(age<18){
            System.out.println("Not eligible for vote");
        }
        else{
            System.out.println("Eligible for vote");
        }
    }
} 
public class Methods {
    public static void main(String[] args) {
        
        Computer obj = new Computer();

        obj.cpu();
        int memoryValue = obj.memory(3);
        System.out.println("Memory value: " + memoryValue);
        obj.vote(20);
        obj.vote(10);
    }
}