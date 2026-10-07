import java.util.Scanner;

public class PositiveN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            if (num <= 0) {
                continue;
            }

            System.out.println("Positive number: " + num);
        }
    }
}