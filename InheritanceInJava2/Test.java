package InheritanceInJava2;

/**
 * This class A is the parent class in which we have one method M1() .
 * @author Himanshu verma
 *
 */


class A{
	public void M1() {
		System.out.println("This belongs to class A");
	}
}

/**
 * This class B is the child class of Class A and in this we do both overriding and parent method calling with the help of super keyword.
 * @author Himanshu verma
 *
 */

class B extends A{
	public void M1() {
		super.M1();
		System.out.println("This belongs to class B");
	}
}

/**
 * This class C is the child class of Class A and in this we do overriding parent class method M1.
 * @author Himanshu Verma
 *
 */

class C extends B{
	public void M1() {
		System.out.println("This belongs to class C");
	}
}

/**
 * This is Class Test drive class and also they contain some more class some class like A , B and C.
 * The output of this program is "this belongs to class C" because of in class they override there parent method .
 * @author Himanshu Verma
 * @version Java-18
 *
 */

public class Test {
	public static void main(String[]agrs) {
		C c = new C();
		c.M1();
	}
}
