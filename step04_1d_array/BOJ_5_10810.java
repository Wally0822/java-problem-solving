package step04_1d_array;

import java.util.Scanner;

public class BOJ_5_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 

        int[] basket = new int[N]; 

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); 
            int j = sc.nextInt(); 
            int k = sc.nextInt(); 

            for (int b = i - 1; b < j; b++) {
                basket[b] = k;
            }
        }

        for (int num : basket) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}