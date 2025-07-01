package step08_math_1;

import java.util.Scanner;

public class BOJ_2_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int remainder = n % b;
            if (remainder < 10) {
                result.append(remainder);
            } else {
                result.append((char) ('A' + remainder - 10));
            }
            n /= b;
        }

        System.out.println(result.reverse().toString());
        sc.close();
    }
}
