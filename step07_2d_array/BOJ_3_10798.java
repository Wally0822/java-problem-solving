package step07_2d_array;

// BOJ 10798: 세로읽기
import java.util.Scanner;

public class BOJ_3_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = String.valueOf(input.charAt(j));
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != null) {
                    System.out.print(arr[i][j]);
                }
            }
        }

        sc.close();
    }
}