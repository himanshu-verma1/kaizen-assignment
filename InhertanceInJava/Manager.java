package InhertanceInJava;
/**
 * This class is Inherited from Employee class and also they have some extra properties which is special for Manager class. Also this class act as sub 
 * class and Employee class act as a super class.
 * @author Himanshu verma
 * @version java 18
 */
public class Manager extends Employee {
	int bonus ;
	/**
	 * This is setter method for Bonus with specified bonus variable.
	 * @param bonus This bonus carry the bonus of manager. 
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	/**
	 * This is getter method for Bonus.
	 * @return This return the bonus of manager.
	 */
	public int getBonus() {
		return this.bonus;
	}
}
