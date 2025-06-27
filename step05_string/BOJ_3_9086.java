package step05_string;

import java.util.Scanner;;

public class BOJ_3_9086 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine(); 
            if (str.length() > 0) {
                System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1)); // Print first and last character
            }
        }

        sc.close();
    }
}