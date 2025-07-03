package step10_geometry01_rectangles_and_triangles;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_8_14215 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = sc.nextInt();
        }

        Arrays.sort(sides);

        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        if (a + b > c) {
            System.out.println(a + b + c); 
        } else {
            System.out.println((a + b) * 2 - 1);
        }

        sc.close();
    }
}
