package step03_loop;

import java.util.Scanner;

public class BOJ_1_2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i <= 9; i ++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        sc.close();
    }
}