package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.print("다섯개의 정수를 입력하세요: ");

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }

//        i=4부터 시작, 4,3,2,1,0
        for (int i =numbers.length-1; i>=0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }//for

    }

}
