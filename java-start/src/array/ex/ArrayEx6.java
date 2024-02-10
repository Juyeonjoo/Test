package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int num = scn.nextInt();

        System.out.print(num + "개의 정수를 입력하세요: ");

        int[] numbers = new int[num];

        int minNumber, maxNumber;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }//for

        minNumber = maxNumber = numbers[0];

        for (int i = 1; i < num; i++) {

            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }//for

        System.out.println("가장 작은 정수: "+minNumber);
        System.out.println("가장 큰 정수: "+ maxNumber);
    }//main
}//class
