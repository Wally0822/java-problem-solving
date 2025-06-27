package step05_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_11_11718 {

    public static void main(String[] args) throws IOException {
        System.out.println("=== Method 1: BufferedReader + while loop ===");
        methodWithBufferedReader();

        // System.out.println("=== Method 2: Scanner + hasNextLine ===");
        // methodWithScanner();
    }

    // 방법 1: BufferedReader 사용 (EOF까지 읽기)
    public static void methodWithBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }

    // 방법 2: Scanner 사용 (hasNextLine 사용)
    public static void methodWithScanner() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}