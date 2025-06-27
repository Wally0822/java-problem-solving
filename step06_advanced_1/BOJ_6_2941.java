package step06_advanced_1;

import java.util.Scanner;

public class BOJ_6_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int count = 0;
        String[] croatianLetters = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String letter : croatianLetters) {
            input = input.replace(letter, "*");
        }

        count = input.length();
        
        System.out.println(count);
    }
}