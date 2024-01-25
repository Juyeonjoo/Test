package scanner;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하시오: ");
        int number = scn.nextInt();

        System.out.println(( number % 2 == 0) ? "짝수 " : "홀수 ");
    }
}
