package step08_math_1;

import java.util.Scanner;

public class BOJ_1_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(n.length() - 1 - i);
            
            if (Character.isDigit(c)) {
                result += (c - '0') * Math.pow(b, i);
            } else {
                result += (c - 'A' + 10) * Math.pow(b, i);
            }
        }

        System.out.println(result);
        sc.close();
    }
}
