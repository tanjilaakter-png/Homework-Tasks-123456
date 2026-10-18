import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }

        System.out.println("Even numbers:");
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
        System.out.println("Count: " + count);
        input.close();
    }
}
