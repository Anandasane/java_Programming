import java.util.*;
// Write a Java program to find the maximum and second maximum element in an array.
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second maximum element found.");
        } else {
            System.out.println("Second maximum element: " + secondMax);
        }
        sc.close();
    }
}