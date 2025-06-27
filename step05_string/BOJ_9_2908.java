package step05_string;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_9_2908 {

    public static void main(String[] args) throws IOException {
        System.out.println("=== Method 1: StringBuilder reverse() ===");
        methodWithStringBuilder();

        System.out.println("=== Method 2: Manual char swap ===");
        methodWithManualReverse();

        System.out.println("=== Method 3: Arithmetic reverse ===");
        methodWithMathReverse();
    }

    // 방법 1: StringBuilder의 reverse() 사용
    public static void methodWithStringBuilder() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int reversedA = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int reversedB = Integer.parseInt(new StringBuilder(b).reverse().toString());

        System.out.println(Math.max(reversedA, reversedB));

        sc.close();
    }

    // 방법 2: 문자열 → char 배열 수동 뒤집기
    public static void methodWithManualReverse() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        String a = input[0];
        String b = input[1];

        String reversedA = "" + a.charAt(2) + a.charAt(1) + a.charAt(0);
        String reversedB = "" + b.charAt(2) + b.charAt(1) + b.charAt(0);

        int numA = Integer.parseInt(reversedA);
        int numB = Integer.parseInt(reversedB);

        System.out.println(Math.max(numA, numB));
    }

    // 방법 3: 수학적 연산으로 숫자 뒤집기
    public static void methodWithMathReverse() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int revA = reverseInt(a);
        int revB = reverseInt(b);

        System.out.println(Math.max(revA, revB));

        sc.close();
    }

    // 수를 뒤집는 함수 (예: 734 → 437)
    private static int reverseInt(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + (num % 10);
            num /= 10;
        }
        return result;
    }
}