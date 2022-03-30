package encapsulationP;

public class employment {
	private int salary;
	private int acount;
	
	public void setter(int a, int b)
	{
		this.salary = a;
		this.acount = b;
	}
	
	
	
	public int calculateM() {
		int result=0;
		result = salary + acount;
		return result;
	}
	
	
}
