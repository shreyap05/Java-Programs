import java.util.Scanner;

class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the no of elements:");
        n = sc.nextInt();
        int ar[] = new int[n];

        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int data;
        System.out.println("Enter the data to be searched:");
        data = sc.nextInt();

        for (i = 0; i < n; i++) {
            if (ar[i] == data) {
                System.out.println("Element found at index: " + i);
                break;
            }

        }
        if (i == n) {
            System.out.println("Element not found");
        }
    }
}
