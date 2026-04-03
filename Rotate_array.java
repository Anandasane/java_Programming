import java.util.*;
/* 


Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.

*/

public class Rotate_array {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of positions to rotate: ");
        int d = sc.nextInt();

        rotateArray(arr, d);
        System.out.println(Arrays.toString(arr));
        sc.close();

        
    }

    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d is greater than n
        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the remaining n-d elements
        reverse(arr, 0, n - 1); // Reverse the entire array
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
