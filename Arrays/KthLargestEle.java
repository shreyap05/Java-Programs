import java.util.Scanner;
public class KthLarSml {
	public static void main(String args[])
	{
		int arr[]= new int[] {5,6,2,1,7,8,0};
		int k=4;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			if(i==k-1)
			{
				System.out.println( k +"th" +" largest element is "+ arr[i]);
				break;
			}
		}
		for(int i=0;i< arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
