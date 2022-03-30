package overloading;

public class userclass {
	public static void main(String []args) {
		sub_overloading s1 =new sub_overloading();
		add_overloading s2 = new add_overloading();
		multiply_overloading s3 =new multiply_overloading();
		division_overloading s4 = new division_overloading();
		System.out.println(s1.sub(12, 23));
		System.out.println(s2.sum(12,33));
		System.out.println(s3.multiply(23.45, 22));
		System.out.println(s4.division(34.5, 12));
	}
}
