package assignment;
import java.util.Scanner;
class first{
    public static void main(String []args){
        System.out.println("Enter your name :");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Enter your last name");
        String last=s.nextLine();
        System.out.println("Enter your Age");
        int age = s.nextInt();
        System.out.println("Enter your marks ");
        float marks = s.nextFloat();
        System.out.println("Enter your Address ");
        String ads = s.nextLine();
        s.close();

        System.out.println("Student name:"+name+" "+ last+ "\n"+"Student age:"+" "+age+"\n"+"Student address :"+ads+"\n" + "Student marks:"+marks);
    }
}
