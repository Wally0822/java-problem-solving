package step06_advanced_1;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2_3003 {

    public static void main(String[] args) throws IOException {
        System.out.println("=== Method 1: Scanner ===");
        methodWithScanner();

        System.out.println("=== Method 2: BufferedReader + split ===");
        methodWithBufferedReader();

        System.out.println("=== Method 3: BufferedReader + StringTokenizer ===");
        methodWithStringTokenizer();
    }

    // 방법 1: Scanner 사용
    public static void methodWithScanner() {
        Scanner sc = new Scanner(System.in);
        int[] standard = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int current = sc.nextInt();
            System.out.print((standard[i] - current) + " ");
        }

        System.out.println();
        sc.close();
    }

    // 방법 2: BufferedReader + split 사용
    public static void methodWithBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] standard = {1, 1, 2, 2, 2, 8};

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 6; i++) {
            int current = Integer.parseInt(input[i]);
            System.out.print((standard[i] - current) + " ");
        }

        System.out.println();
    }

    // 방법 3: BufferedReader + StringTokenizer 사용
    public static void methodWithStringTokenizer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] standard = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            int current = Integer.parseInt(st.nextToken());
            System.out.print((standard[i] - current) + " ");
        }

        System.out.println();
    }
}