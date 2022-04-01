package InheritanceInJava3;
import java.util.Scanner;
public class Driveclass {
	public static void main(String[] args) {
		Vehicle v;
		String str = null;
		Scanner s =new Scanner(System.in);
		
		str = s.nextLine();
		s.close();
		
		if(str.equalsIgnoreCase("bus")) {
			v = new Bus();
			v.fuelAmount();
		}else if(str.equalsIgnoreCase("Car")) {
			v = new Car();
			v.fuelAmount();
		}
		else if(str.equalsIgnoreCase("truck")) {
			v = new Truck();
			v.fuelAmount();
		}
				
	}
}
