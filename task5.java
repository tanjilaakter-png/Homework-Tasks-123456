import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height (at least 2): ");
        int height = input.nextInt();
        System.out.print("Enter width (at least 2): ");
        int width = input.nextInt();

        if (height < 2 || width < 2) {
            System.out.println("Height and width must both be at least 2.");
            input.close();
            return;
        }

        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= width; col++) {
                if (row == 1 || row == height || col == 1 || col == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
