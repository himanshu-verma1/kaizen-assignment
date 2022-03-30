package assignment;
import java.util.Scanner;
public class fifth {
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number in between 1 to 7 ");
        int n=s.nextInt();
        s.close();
        if(n==1){
            System.out.println("Monday");
        }
        else if(n==2){
            System.out.println("Tuesday");
        }
        else if(n==3){
            System.out.println("Wednesday");
        }
        else if(n==4){
            System.out.println("Thuesday");
        }
        else if(n==5){
            System.out.println("Friday");
        }
        else if(n==6){
            System.out.println("Saturday");
        }
        else if(n==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("enter write number");
        }
    }
}
