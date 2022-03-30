package starPartten;
import java.util.Scanner;
public class triangle2 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  limit");
		int n= s.nextInt();
		for(int i=0 ; i<n;i++) {
			for(int j=0;j<n-i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
