package step02_conditional;

import java.util.Scanner;

public class BOJ_6_2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cookTime = sc.nextInt();

        minute += cookTime; 
        if(minute >= 60){
            hour += minute / 60;
            minute = minute % 60;
        }
        if(hour >= 24){
            hour = hour % 24;
        }

        System.out.println(hour + " " + minute);
        sc.close();
    }   
}