package InhertanceInJava;
/**
 * This class contain all the required fields for Employee.
 * @author Himanshu verma
 * @version java 18
 *
 */
public class Employee {
	String name1;
	int salary;
	int age;
	int level;
	
	/**
	 * This is setter method for name with a specified name variable.
	 * @param name this name variable will carry the name of employee
	 */
	public void setName(String name) {
		this.name1 =name;
	}
	
	/**
	 * This is setter method for salary with a specified salary variable.
	 * @param salary this salary variable will carry the salary of employee
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * This is setter method for age with a specified age variable.
	 * @param age This age variable will carry the age of employee
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * This is setter method for level with a specified level variable.
	 * @param level This level variable will carry the age of employee
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * This is getter method for name.
	 * @return This return name of the employee.
	 */
	public String getName() {
		return this.name1;
	}
	
	/**
	 * This is getter method for salary.
	 * @return This return salary of the employee
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * This is getter method for age.
	 * @return This return age of the employee
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * This is getter method for level 
	 * @return This return the level of the employee
	 */
	public int getLevel() {
		return this.level;
	}
	
}
