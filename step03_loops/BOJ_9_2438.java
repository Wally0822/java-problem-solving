package step03_loops;

import java.util.Scanner;

public class BOJ_9_2438 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            StringBuilder stars = new StringBuilder();
            for(int j = 0; j < i; j++){
                stars.append("*");
            }
            System.out.println(stars.toString());
        }       

        sc.close();
    }
}