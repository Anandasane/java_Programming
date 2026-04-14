import java.util.Scanner;



public class butterfly_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

       
        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
