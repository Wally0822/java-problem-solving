package step08_math_1;

import java.util.Scanner;

public class BOJ_5_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1; 
        int range = 1; 

        while (n > range) {
            range += 6 * count;
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
