package classes;
import classes.employment;
import java.util.Scanner;
public class test {

	public static void main(String[]args) {
		employment E1= new employment();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number ");
		int a= s.nextInt();
		int b= s.nextInt();
		E1.setNum(a, b);
		System.out.println(E1.getNum1());
		System.out.println(E1.getNum2());
		s.close();
	}
}
