package step05_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;   

public class BOJ_5_11720 {
    public static void main(String[] args) throws IOException {
        System.out.println("=== Method 1: Scanner ===");
        methodWithScanner();

        System.out.println("=== Method 2: BufferedReader ===");
        methodWithBufferedReader();

        System.out.println("=== Method 3: char[] iteration ===");
        methodWithCharArray();
    }

    // 방법 1: Scanner 사용
    public static void methodWithScanner() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            // 숫자의 개수
        String digits = sc.next();       // 공백 없는 숫자 문자열
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += digits.charAt(i) - '0'; // 문자 -> 숫자 변환
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }

    // 방법 2: BufferedReader 사용
    public static void methodWithBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 숫자의 개수
        String digits = br.readLine();              // 숫자 문자열
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += digits.charAt(i) - '0';
        }

        System.out.println("Sum: " + sum);
    }

    // 방법 3: char 배열 사용
    public static void methodWithCharArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); 
        char[] chars = br.readLine().toCharArray();
        int sum = 0;

        for (char c : chars) {
            sum += c - '0';
        }

        System.out.println("Sum: " + sum);
    }
}