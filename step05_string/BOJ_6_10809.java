package step05_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_6_10809 {

    public static void main(String[] args) throws IOException {
        System.out.println("=== Method 1: indexOf() ===");
        methodUsingIndexOf();

        System.out.println("=== Method 2: 직접 탐색 ===");
        methodWithManualLoop();

        System.out.println("=== Method 3: ASCII 배열 ===");
        methodWithAsciiArray();
    }

    // 방법 1: String.indexOf() 활용
    public static void methodUsingIndexOf() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(s.indexOf(c) + " ");
        }
        System.out.println();
    }

    // 방법 2: 수동 반복 
    public static void methodWithManualLoop() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] pos = new int[26];
        for (int i = 0; i < 26; i++) {
            pos[i] = -1; 
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (pos[idx] == -1) {
                pos[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
    }

    // 방법 3: Scanner + 아스키 배열 
    public static void methodWithAsciiArray() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] alpha = new int[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alpha[c - 'a'] == -1) {
                alpha[c - 'a'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}