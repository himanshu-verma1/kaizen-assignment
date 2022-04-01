package OverriddingInJava;
/**
 * This is Manager class which is Inherited by Employee class with specified f
 * @author Himanshu Verma
 * @version java-18
 *
 */
public class Manager extends Employee {
	int bonus;
	/**
	 * This is setter method for Bonus of manager. with specified variable a.
	 * @param a This "a" carry bonus of manager.
	 */
	public void setBonus(int a) {
		bonus = a;
	}
	
	/**
	 * This is getter method for Bonus of  manager
	 * @return They return value of bonus.
	 */
	public int getBonus() {
		return bonus;
	}
	
	/**
	 * This is override method of getSalary() of class Employee.
	 * @return They return the sum of bonus and salary of manager;
	 */
	public int getSalary() {
		return salary + bonus;
	}
}
