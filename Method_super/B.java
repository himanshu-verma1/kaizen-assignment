package Method_super;
/**
 * This is class B with specific method M1. Which is Inherited by class A. And in this class we overriding M1 method , also we call previous method 
 * as well using super keyword.
 * @author Himanshu Verma
 * @version Java-18
 *
 */

public class B extends A{
	public void M1() {
		System.out.println("M1 in the class B");
	}
	public void show() {
		super.M1();
	}
}
