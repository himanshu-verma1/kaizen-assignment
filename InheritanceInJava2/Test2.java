package InheritanceInJava2;

/**
 * This class is declare as a final class so we facing one error that is "he public type A must be defined in its own file" its means if we need to 
 * declare class final so the only way is that class name same as file name
 * @author Himanshu verma
 *
 */
public final class A{
	
	public void M1() {
		System.out.println("This class belongs to class A");
	}
}


/**
 * This class is the child class of class A which is declare as a final so we found error that is "The type B cannot subclass the final class A".
 * it's simply means that final method doesn't have there child class .
 * @author Himanshu verma
 *
 */

public class B extends A{
	public void M1() {
		System.out.println("This class belong to class B");
	}
}

/**
 * This class is the drive class . in which we create has-a relationship with class B. And call M1() method .
 * @author Himanshu verma
 *
 */

public class Test2 {
	public static void main(String[]args) {
		B b=new B();
		b.M1();
	}
}
