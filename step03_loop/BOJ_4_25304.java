package step03_loop;

import java.util.Scanner;

public class BOJ_4_25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); 
        int N = sc.nextInt(); 
        int totalCost = 0;

        for(int i = 0; i < N; i++){
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            totalCost += price * quantity;
        }

        if(totalCost == X){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}