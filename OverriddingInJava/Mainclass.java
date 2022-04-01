package OverriddingInJava;
/**
 * This is Main class in which we create has-a relationship between Manager class. 
 * @author Himanshu Verma
 * @version Java-18
 *
 */
public class Mainclass {
	public static void main(String[]args) {
		Manager M1 =new Manager();
		M1.setSalary(123);
		M1.setBonus(200);
		System.out.println("The total salary of Manager :- "+M1.getSalary());
	}
}
