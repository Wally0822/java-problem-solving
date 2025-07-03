package step11_time_complexity;

import java.util.Scanner;

public class BOJ_7_24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();  // 계수
        int a0 = sc.nextInt();  // 상수항
        int c = sc.nextInt();   // 빅오의 상수
        int n0 = sc.nextInt();  // 시작점

        boolean ok = true;

        for (int n = n0; n <= 100; n++) {  // 문제 조건상 n은 최대 100까지
            long fn = 1L * a1 * n + a0;
            long cn = 1L * c * n;
            if (fn > cn) {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? 1 : 0);
        sc.close();
    }
}
