package step03_loop;

import java.util.Scanner;

public class BOJ_5_25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int longCount = N / 4;
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < longCount; i++){
            result.append("long ");
        }
        
        result.append("int");
        System.out.println(result.toString());
        
        sc.close();
    }
}