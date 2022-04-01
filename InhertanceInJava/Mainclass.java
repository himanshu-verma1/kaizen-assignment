package InhertanceInJava;
/**
 * This class is main class, In this Manager class and Secretary class connect with has-a relationship.
 * @author hpcus
 * @version java 18
 */
public class Mainclass {
	public static void main(String[]args) {
		Manager M1 = new Manager();
		Secretary S1 = new Secretary();
		
		M1.setName("Himanshu");
		M1.setAge(22);
		M1.setSalary(900);
		M1.setLevel(4);
		M1.setBonus(200);
		
		System.out.println("The name of Manager is "+ M1.getName());
		System.out.println("The age of "+M1.getName()+ " is "+ M1.getAge());
		System.out.println("The Salary of "+M1.getName()+ " is "+ M1.getSalary());
		System.out.println("The Level of "+M1.getName()+ " is "+ M1.getLevel());
		System.out.println("The Bonus of "+M1.getName()+ " is "+ M1.getBonus());
		System.out.println("*********************");
		//here we call secretary's method
		S1.time();
		
		
	}
}
