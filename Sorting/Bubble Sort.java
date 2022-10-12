import java.util.Scanner;

class BubbleSort {
    public static void main(String args[]) {
        int i, j, n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j] = temp;
            }
        }
        System.out.println("Sorted Array: ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}