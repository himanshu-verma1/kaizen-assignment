package starPartten;
import java.util.Scanner;
public class trianglePartten {
	public static void main(String[]arggs) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		s.close();
		for (int i=0 ; i<n ; i++)
		{
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
