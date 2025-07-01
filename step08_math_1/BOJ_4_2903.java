package step08_math_1;

import java.util.Scanner;

public class BOJ_4_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int points = (int) Math.pow(2, n) + 1;
        
        long area = (long) points * points;
        
        System.out.println(area);
        sc.close();
    }
}
