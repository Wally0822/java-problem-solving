package step05_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_8_1152 {

    public static void main(String[] args) throws IOException {
        System.out.println("=== Method 1: BufferedReader + split() ===");
        methodWithBufferedReader();

        System.out.println("=== Method 2: Scanner + split() ===");
        methodWithScanner();

        System.out.println("=== Method 3: Manual loop ===");
        methodWithManualLoop();
    }

    // 방법 1: BufferedReader + trim() + split(" ")
    public static void methodWithBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.split(" ");
            System.out.println(words.length);
        }
    }

    // 방법 2: Scanner + nextLine() + split()
    public static void methodWithScanner() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.split(" ");
            System.out.println(words.length);
        }

        sc.close();
    }

    // 방법 3: 수동 반복 방식 (공백 체크)
    public static void methodWithManualLoop() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int count = 0;
        boolean inWord = false;

        for (char c : input.toCharArray()) {
            if (c != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println(count);
    }
}