package assignment;
import java.util.Scanner;
public class second {
    public static void main(String[]args)
    {
        System.out.println("Enter hours");
        Scanner s=new Scanner(System.in);
        float a = s.nextFloat();
        float b = a*60;
        System.out.println(b);

        System.out.println("Enter minutes");
        float c= s.nextFloat();
        System.out.println("Hours is ::"+" "+(c/60));

        s.close();
    }
}
