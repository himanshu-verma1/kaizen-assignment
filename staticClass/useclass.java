package staticClass;
import staticClass.staticClass;
public class useclass {
	public static void main(String[]args) {
		//call static method
		
		System.out.println("College detail");
		staticClass.show();
		System.out.println("***********");
		//call non static method using both parameter and non parameter constructor
		staticClass S1 =new staticClass();
		staticClass S2 =new  staticClass(101,"himanshu");
		System.out.println("Student 1");
		S1.detail();
		System.out.println("*********");
		System.out.println("Student 2");
		S2.detail();
		System.out.println("********");
		
		System.out.println("After value change");
		
		//change static variable value
		
		staticClass.clg_name = "kaizen";
		staticClass.clg_code = 123;
		
		staticClass.show();
		
		System.out.println("***********");
		
		//change non static varialbe value
		S1.student_name = "Himanshi";
		S1.student_class = 102;
		
		S1.detail();
		
		
	}
}
