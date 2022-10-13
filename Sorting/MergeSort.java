import java.util.Scanner;
public class MergeSort {
	int array[];
	int tempArr[];
	int length;
	public static void main(String args[])
	{
		int arr[]= new int[] {5,2,6,1,3,8,9,0};
		MergeSort ob=new MergeSort();
		ob.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	public void sort(int arr[])
	{
		this.array=arr;
		this.length=arr.length;
		this.tempArr= new int [length];
		divideArray(0, length-1);
	}
	public void divideArray(int l,int h)
	{
		if(l<h)
		{
			int mid=l+(h-l)/2;
			
			//left side
			divideArray(l,mid);
			
			//right side
			divideArray(mid+1,h);
			
			mergeArray(l,mid,h);
		}
	}
	public void mergeArray(int l, int mid, int h)
	{
		for(int i=l;i<=h;i++)
		{
			tempArr[i]=array[i];
		}
		int i=l;
		int j=mid+1;
		int k=l;
		while(i<=mid && j<=h)
		{
			if(tempArr[i]<=tempArr[j])
			{
				array[k]=tempArr[i];
				i++;
			}
			else
			{
				array[k]=tempArr[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			array[k]=tempArr[i];
			k++;
			i++;
		}
		
				
	}

}
