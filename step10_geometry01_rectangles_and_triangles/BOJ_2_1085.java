package step10_geometry01_rectangles_and_triangles;

import java.util.Scanner;

public class BOJ_2_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minDistance = Math.min(Math.min(x, w - x), Math.min(y, h - y));
        
        System.out.println(minDistance);
        sc.close();
    }
}
