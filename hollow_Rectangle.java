import java.util.Scanner;


public class hollow_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hollow rectangle: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the hollow rectangle: ");
        int cols = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print '*' for the borders, otherwise print space
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
