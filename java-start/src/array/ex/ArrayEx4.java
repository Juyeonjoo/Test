package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.print("다섯개의 정수를 입력하세요: ");
        int sum = 0;

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scn.nextInt();
            sum += numbers[i];
        }

        System.out.println("sum : " + sum);

        double average= sum / numbers.length;
        System.out.println("average : " + average);
    }
}
