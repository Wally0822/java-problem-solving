package step04_1d_array;

import java.util.Scanner;

public class BOJ_8_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] remainderExists = new boolean[42]; 
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            int remainder = number % 42;

            if (!remainderExists[remainder]) {
                remainderExists[remainder] = true;
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}