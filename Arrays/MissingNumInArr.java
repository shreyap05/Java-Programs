import java.util.Scanner;
public class MissingNumber {
	public static void main(String args[])
	{
		int arr[]= new int[] {1,2,3,5,6};
		int exp_no_ele =arr.length+1;
		int total_sum= (exp_no_ele*(exp_no_ele +1))/2;
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int missNum= total_sum-sum;
		System.out.print("Missing Number in the array is: " +missNum);
	}

}
