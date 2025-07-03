package step11_time_complexity;

import java.util.Scanner;

public class BOJ_3_24264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long timeComplexity = (long) N * N; 
        
        System.out.println(timeComplexity);
        System.out.println(2); 
        
        sc.close();
    }
}
