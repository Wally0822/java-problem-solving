package step06_advanced_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class BOJ_8_25206 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;  
        double total = 0.0; 

        for (int i = 0; i < 20; i++) {
            String[] parts = br.readLine().split(" ");
            double credit = Double.parseDouble(parts[1]);
            String grade = parts[2];

            if (grade.equals("P")) continue; 

            double point = gradeMap.get(grade);
            sum += credit * point;
            total += credit;
        }

        double gpa = sum / total;
        System.out.printf("%.6f\n", gpa); 
    }
}