package array.ex;

import javax.swing.*;
import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[][] scores = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0 ; i < scores.length; i++) {
            System.out.println((i+1)+ "번째 학생의 성적을 입력하세요: ");

            for (int j = 0; j < scores[i].length ; j++) {
                System.out.println(subjects[j]+" 점수: ");

                scores[i][j] = scn.nextInt();
            }
        }//for


        for (int i = 0; i < scores.length; i++) {
            int total=0;

            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            System.out.println((i+1)+"번째 학생의 총점: " + total);
            System.out.println((i+1)+"번째 학생의 평균: " + (double) total/scores.length);
        }//for

    }//main

}//class
