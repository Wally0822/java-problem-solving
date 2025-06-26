package step04_1d_array;

import java.util.Scanner;

public class BOJ_9_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] baskets = new int[N];

        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt() - 1; 
            int end = sc.nextInt() - 1;   

            while (start < end) {
                int temp = baskets[start];
                baskets[start] = baskets[end];
                baskets[end] = temp;
                start++;
                end--;
            }
        }

        for (int basket : baskets) {
            System.out.print(basket + " ");
        }

        sc.close();
    }
}