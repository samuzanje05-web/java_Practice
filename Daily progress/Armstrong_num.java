package Assignment1;
import java.util.Scanner;

public class Armstrong_num {
    static int count_Digit(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 101;
        }
        return count;
    }

    static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    static boolean isArmstrong(int number) {
        int original = number;
        int digits = count_Digit(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + power(digit, digits);
            number = number / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Start: ");
        int start = sc.nextInt();

        System.out.print("End: ");
        int end = sc.nextInt();

        System.out.print("Armstrong number: ");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
