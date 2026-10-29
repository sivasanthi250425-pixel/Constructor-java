import java.util.Scanner;


    public class stu{
        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        double cgpa;
        stu(String name, int age,double cgpa){
            this.name=name;
            this.age=age;
            this.cgpa=cgpa;
        }
        
    
public class Main {
    public static void main(String[] args){
stu s1=new stu("siva",19,9.05);
stu s2=new stu("iva",21,8.05);
System.out.println(s1.name);
System.out.println(s2.name);
    }
}


}
