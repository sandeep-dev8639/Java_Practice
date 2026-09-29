class Student{
    int roll;
    String name;
    int marks;
}
public class DefaultValueOfArray {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 10;
        s1.name = "sandeep";
        s1.marks = 88;

        Student s2 = new Student();
        s2.roll = 20;
        s2.name = "kiran";
        s2.marks = 80;

        Student s3 = new Student();
        s3.roll = 30;
        s3.name = "ravi";
        s3.marks = 90;

        

        Student stu[] = new Student[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].name + ":" + stu[i].marks);
        }

        // int[] arr = new int[5];

        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        //    
        
    }
}
