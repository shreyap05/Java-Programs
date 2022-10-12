import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String args[]) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter number of elements");
		int a[] = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		System.out.println("The array elements are: " );
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
