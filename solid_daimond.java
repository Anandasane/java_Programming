import java.util.Scanner;


public class solid_daimond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the solid diamond: ");
        int rows = scanner.nextInt();
        
        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print '*' for the upper part of the diamond
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print '*' for the lower part of the diamond
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
