package step11_time_complexity;

import java.util.Scanner;

public class BOJ_4_24265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);

        sc.close();
    }
}
