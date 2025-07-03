package step11_time_complexity;

import java.util.Scanner;

public class BOJ_7_24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        System.out.println(n * n * n + 2 * n * n + 3 * n + 4);
        System.out.println(3);
        
        sc.close();
    }
}
