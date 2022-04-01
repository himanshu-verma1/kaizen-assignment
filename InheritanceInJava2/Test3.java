package InheritanceInJava2;
/**
 * This Class A is the parent class for following Test3 class with private constructor .
 * @author Himanshu Verma
 *
 */
class A{
	private A() {
		System.out.println("private A");
	}
	
}

/**
 * This Class is the sub child of class A . But it shows error because the class A have private constructor which is not use out side the class .
 * also we facing some problem "Implicit super constructor A() is not visible for default constructor. Must define an explicit constructor".
 * @author Himanshu Verma
 *
 */

public class Test3 extends A {
	public static void main(String[]args) {
		Test3 a= new Test3();
	}
}
