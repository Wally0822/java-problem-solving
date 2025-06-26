package step02_conditional;

import java.util.Scanner;

public class BOJ_5_2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        if(minute < 45){
            minute += 15; 
            hour --; 
            if(hour < 0) {
                hour = 23; 
            }
        } else {
            minute -= 45; 
        }

        System.out.println(hour + " " + minute); 
        sc.close();
    }
}