import java.util.Scanner;
public class InsertionSort {
	public static void main (String args[])
	{
		int temp,j;
		int arr[]=new int[] {5,1,6,3,2,7,8};
		for(int i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
				
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
