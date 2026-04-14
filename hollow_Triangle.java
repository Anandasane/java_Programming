import java.util.Scanner;


public class hollow_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hollow triangle: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Print '*' for the borders, otherwise print space
                if (j == 1 || j == i || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
