package assignment;
import java.util.Scanner;
public class tenth {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of odd number ");
		int n=s.nextInt();
		s.close();
		for(int i=0; i<n;i++)
		{
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
	}
}
