package step04_1d_array;

import java.util.Scanner;

public class BOJ_4_2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int index = 0;
       
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                index = i + 1;
            }
        }
        
        System.out.println(max);
        System.out.println(index);
        sc.close();
    }
}