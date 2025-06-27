package step05_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10_5622 {

    public static void main(String[] args) throws IOException {
        System.out.println("=== Method 1: if-else logic ===");
        methodWithIfElse();

        System.out.println("=== Method 2: switch-case ===");
        methodWithSwitchCase();

        System.out.println("=== Method 3: array mapping ===");
        methodWithArrayMapping();
    }

    // 방법 1: if-else로 처리
    public static void methodWithIfElse() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int total = 0;

        for (char c : word.toCharArray()) {
            if (c >= 'A' && c <= 'C') total += 3;
            else if (c >= 'D' && c <= 'F') total += 4;
            else if (c >= 'G' && c <= 'I') total += 5;
            else if (c >= 'J' && c <= 'L') total += 6;
            else if (c >= 'M' && c <= 'O') total += 7;
            else if (c >= 'P' && c <= 'S') total += 8;
            else if (c >= 'T' && c <= 'V') total += 9;
            else if (c >= 'W' && c <= 'Z') total += 10;
        }

        System.out.println(total);
    }

    // 방법 2: switch-case 방식
    public static void methodWithSwitchCase() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int total = 0;

        for (char c : word.toCharArray()) {
            switch (c) {
                case 'A': case 'B': case 'C': total += 3; break;
                case 'D': case 'E': case 'F': total += 4; break;
                case 'G': case 'H': case 'I': total += 5; break;
                case 'J': case 'K': case 'L': total += 6; break;
                case 'M': case 'N': case 'O': total += 7; break;
                case 'P': case 'Q': case 'R': case 'S': total += 8; break;
                case 'T': case 'U': case 'V': total += 9; break;
                case 'W': case 'X': case 'Y': case 'Z': total += 10; break;
            }
        }

        System.out.println(total);
    }

    // 방법 3: 문자 → 시간 배열 매핑
    public static void methodWithArrayMapping() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        // A~Z = 26개, 인덱스 0 = A
        int[] dial = new int[26];
        for (char c = 'A'; c <= 'Z'; c++) {
            if (c <= 'C') dial[c - 'A'] = 3;
            else if (c <= 'F') dial[c - 'A'] = 4;
            else if (c <= 'I') dial[c - 'A'] = 5;
            else if (c <= 'L') dial[c - 'A'] = 6;
            else if (c <= 'O') dial[c - 'A'] = 7;
            else if (c <= 'S') dial[c - 'A'] = 8;
            else if (c <= 'V') dial[c - 'A'] = 9;
            else dial[c - 'A'] = 10;
        }

        int total = 0;
        for (char c : word.toCharArray()) {
            total += dial[c - 'A'];
        }

        System.out.println(total);
    }
}