import java.util.*;

/*
 
Q6) Given an array of integers where every element appears even number of
times except one element which appears odd number of times, write a program to
find that odd occurring element in O(log n) time. The equal elements must
appear in pairs in the array but there cannot be more than two consecutive
occurrences of an element.


*/
public class Find_odd_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int low = 0, high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    low = mid + 2;
                } else {
                    high = mid;
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        System.out.println(arr[low]);
        sc.close();
    }
}


