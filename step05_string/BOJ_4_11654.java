package step05_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_4_11654 {
    public static void main(String[] args) throws IOException{
        System.out.println("=== Method 1: Scanner === ");
        methodWithScanner();

        System.out.println("=== Method 2: BufferedReader === ");
        methodWithBufferedReader();

        System.out.println("=== Method 3: System.in.read() === ");
        methodWithSystemInRead();
    }

    // 방법 1 : Scanner 사용
    public static void methodWithScanner(){
        Scanner sc = new Scanner(System.in);
        char input = sc.nextLine().charAt(0);
        System.out.println((int) input);
        sc.close();
    }

    // 방법 2 : BufferedReader 사용
    public static void methodWithBufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char input = br.readLine().charAt(0);
        System.out.println((int) input);
    }

    // 방법 3 : System.in.read() 사용
    public static void methodWithSystemInRead() throws IOException {
        int asciiValue = System.in.read();
        System.in.read(); 
        System.out.println(asciiValue);
    }
}