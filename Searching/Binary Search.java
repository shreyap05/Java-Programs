import java.util.Scanner;
class binarySearch
{

    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n=sc.nextInt();
    
        int a[]=new int[n];
        int l=0, r=n-1;
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int data;
        System.out.println("Enter the data to be searched: ");
        data=sc.nextInt();
        while(l<r)
        {
            int mid=(l+r)/2;
            if(a[mid]==data)
            {
                System.out.println("Element is found at index: " + mid);
                break;
            }
            
            else if(data > a[mid])
            l=mid+1;
            else 
            r=mid-1;
        }
        if(l>r)
        System.out.println("Element not found ");

    }
    
}