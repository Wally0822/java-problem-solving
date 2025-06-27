package step06_advanced_1;

import java.util.Scanner;

public class BOJ_5_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        int[] frequency = new int[26];

        for (char c : input.toCharArray()) {
            frequency[c - 'A']++;
        }

        int maxFreq = 0;
        char result = '?';
        boolean isDuplicate = false;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                result = (char) (i + 'A');
                isDuplicate = false;
            } else if (frequency[i] == maxFreq) {
                isDuplicate = true;
            }
        }

        System.out.println(isDuplicate ? '?' : result);
        sc.close();
    }
}