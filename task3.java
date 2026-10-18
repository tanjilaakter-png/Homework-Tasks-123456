import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 0 to 12: ");
        int n = input.nextInt();

        if (n < 0 || n > 12) {
            System.out.println("Please enter a number between 0 and 12.");
            input.close();
            return;
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
        input.close();
    }
}
