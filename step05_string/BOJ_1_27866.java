package step05_string;

import java.util.Scanner;

public class BOJ_1_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index = sc.nextInt();
        
        // Adjust index to be zero-based
        if (index > 0 && index <= input.length()) {
            System.out.println(input.charAt(index - 1));
        } else {
            System.out.println("Index out of bounds");
        }
        
        sc.close();
    }
}