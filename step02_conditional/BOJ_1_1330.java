package step02_conditional;

import java.util.Scanner;

public class BOJ_1_1330 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B){
            System.out.println(">");
        }
        else if(A < B){
            System.out.println("<");
        }
        else{
            System.out.println("==");   
        }

        sc.close();
    }   
}