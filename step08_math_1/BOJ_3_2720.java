package step08_math_1;

import java.util.Scanner;

public class BOJ_3_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int c = sc.nextInt(); // Amount in cents
            int quarters = c / 25;
            c %= 25;
            int dimes = c / 10;
            c %= 10;
            int nickels = c / 5;
            c %= 5;
            int pennies = c;

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }

        sc.close();
    }
}
