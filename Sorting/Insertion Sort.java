import java.util.Scanner;
class InsertionSort
{
    public static void main(String args[])
    {
        int temp,j,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
            
            
        }
        System.out.println("Sorted Array: ");
            for(i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }
    }
}