package step09_divisors_multiples_and_primes_1;

import java.util.Scanner;

public class BOJ_6_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 1) return; // N이 1인 경우 출력하지 않음

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        // 마지막에 남은 n이 1보다 크면 그것도 소인수
        if (n > 1) {
            System.out.println(n);
        }
        
        sc.close();
    }
}
