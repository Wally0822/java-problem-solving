package step02_conditional;

import java.util.Scanner;

public class BOJ_7_2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if(A == B && B == C) {
            System.out.println(10000 + A * 1000);
        } else if(A == B || B == C || A == C) {
            int sameValue = (A == B) ? A : (B == C) ? B : C;
            System.out.println(1000 + sameValue * 100);
        } else {
            int max = Math.max(A, Math.max(B, C));
            System.out.println(max * 100);
        }
        
        sc.close();
    }
}