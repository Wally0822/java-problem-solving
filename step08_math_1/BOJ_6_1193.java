package step08_math_1;

import java.util.Scanner;

public class BOJ_6_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int line = 1;  
        int count = 0; 

        while (count + line < X) {
            count += line;
            line++;
        }

        int indexInLine = X - count;  

        int numerator, denominator;

        if (line % 2 == 0) {
            numerator = indexInLine;
            denominator = line - indexInLine + 1;
        } else {
            numerator = line - indexInLine + 1;
            denominator = indexInLine;
        }

        System.out.println(numerator + "/" + denominator);
        sc.close();
    }
}
