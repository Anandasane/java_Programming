import java.util.Scanner;

public class SumOfPrime {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int upper = sc.nextInt();
        
        long sum = 0;
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers between " + lower + " and " + upper + " is: " + sum);
        sc.close();
    }
}   