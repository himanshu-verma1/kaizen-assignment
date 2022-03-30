package encapsulationP;
import encapsulationP.employment;
import java.util.Scanner;
public class callM {
	public static void main(String []args) {
		employment E1 = new employment();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount");
		int a = s.nextInt();
		System.out.println("Enter the bonous");
		int b=s.nextInt();
		E1.setter(a , b);
		s.close();
		
		System.out.println("Total is :-" + E1.calculateM());
		
		
	}
}
