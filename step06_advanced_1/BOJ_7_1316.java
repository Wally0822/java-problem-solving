package step06_advanced_1;

import java.util.Scanner;

public class BOJ_7_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            boolean[] alphabetVisited = new boolean[26];
            boolean isGroupWord = true;

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                if (j > 0 && currentChar != word.charAt(j - 1) && alphabetVisited[currentChar - 'a']) {
                    isGroupWord = false;
                    break;
                }
                alphabetVisited[currentChar - 'a'] = true;
            }

            if (isGroupWord) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }   
}