package classes;

public class employment {
	private int A1 ,A2;
	
	public int getNum1() {
		return A1;
	}
	
	public int getNum2() {
		return A2;
	}
	
	
	public void setNum(int a, int b) {
		this.A1 = a;
		this.A2 = b;
	}
	
	public int calculateSalary(int salary ,int bonous) {
		int result= 0;
		result = salary + bonous;
		return result;
	}
}
