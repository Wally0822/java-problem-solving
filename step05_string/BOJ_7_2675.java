package step05_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_7_2675 {

    public static void main(String[] args) throws IOException {
        System.out.println("=== Method 1: Scanner + StringBuilder ===");
        methodWithScanner();

        System.out.println("=== Method 2: BufferedReader + char array ===");
        methodWithBufferedReader();

        System.out.println("=== Method 3: BufferedReader + StringBuilder optimized ===");
        methodWithBufferedReaderOptimized();
    }

    // 방법 1: Scanner 사용 + StringBuilder
    public static void methodWithScanner() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                sb.append(String.valueOf(c).repeat(r));
            }

            System.out.println(sb.toString());
        }

        sc.close();
    }

    // 방법 2: BufferedReader + char 배열 사용
    public static void methodWithBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            char[] chars = input[1].toCharArray();
            String result = "";

            for (char c : chars) {
                for (int i = 0; i < r; i++) {
                    result += c; 
                }
            }

            System.out.println(result);
        }
    }

    // 방법 3: BufferedReader + StringBuilder 
    public static void methodWithBufferedReaderOptimized() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int r = Integer.parseInt(input[0]);
            String s = input[1];

            StringBuilder sb = new StringBuilder(s.length() * r);
            for (char c : s.toCharArray()) {
                sb.append(String.valueOf(c).repeat(r));
            }

            System.out.println(sb.toString());
        }
    }
}