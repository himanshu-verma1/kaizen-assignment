package assignment;
import java.util.Scanner;
public class fourth {
    public static void main(String []args){
        Scanner  s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=s.nextInt();
        s.close();
        if(n>20)
        {
            System.out.println(n+" is greater then 20");
        }
        else {
            System.out.println(n+" is smaller then 20");
        }
    }
}
