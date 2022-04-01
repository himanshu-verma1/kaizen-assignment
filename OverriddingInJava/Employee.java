package OverriddingInJava;
/**
 * This is Employee class which carry some field and class member.
 * @author Himanshu verma
 * @version java-18
 *
 */
public class Employee {
	public int salary;
	
	/**
	 * This is Setter method for salary of Employee. with specified variable a
	 * @param a This "a" carry the Salary of Employee.
	 */
	
	public void setSalary(int a) {
		salary = a;
	}
	/**
	 * This is getter method for salary of Employee.
	 * @return They return the salary of Employee.
	 */
	public int getSalary() {
		return salary;
	}
}
