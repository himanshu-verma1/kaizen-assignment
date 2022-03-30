package classes;
import java.util.Scanner;
import classes.employment;
public class salary {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total salary");
		int amt = s.nextInt();
		System.out.println("Enter the bonous");
		int bonous =s.nextInt();
		employment E1 = new employment();
		System.out.println("Total monthly salary is :-"+ E1.calculateSalary(amt, bonous));
		s.close();
		
	}
}
