package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("입력받을 개수: ");
        int num = scn.nextInt();

        int[] numbers = new int[num];
        System.out.print(num+ "개의 정수를 입력하세요: ");

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
