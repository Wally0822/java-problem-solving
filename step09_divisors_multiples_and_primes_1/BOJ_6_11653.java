package step09_divisors_multiples_and_primes_1;

import java.util.Scanner;

public class BOJ_6_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Input must be greater than or equal to 2.");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    sb.append(i).append("\n");
                    n /= i;
                    break;
                }
            }
        }
        
        System.out.print(sb.toString());
        sc.close();
    }
}
