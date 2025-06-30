package step07_2d_array;

import java.util.Scanner;

public class BOJ_4_2563 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] paper = new boolean[100][100]; 

        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y + 10; k++){
                    paper[j][k] = true;
                }
            }
        }

        int area = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(paper[i][j]) {
                    area++;
                }
            }
        }

        System.out.println(area);
        sc.close();
    }
}