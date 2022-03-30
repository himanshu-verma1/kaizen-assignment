package staticClass;

public class staticClass {

	//variable 
	static String clg_name = " Piemr";
	static int clg_code = 863;
	String student_name ;
	int student_class ;
	
	//non parameter constuctor
	
	staticClass(){
		this.student_name = "NAN";
		this.student_class= 0 ;
	}
	
	//parameter constructor
	
	staticClass(int a , String b){
		this.student_class = a;
		this.student_name =b;
	}
	
	
	//static method 
	
	public static void show() {
		System.out.println(clg_name);
		System.out.println(clg_code);
	}
	
	
	//non Static method
	
	public void detail() {
		System.out.println(student_name);
		System.out.println(student_class);
		//use static method in non static method
		show();
	}
}
