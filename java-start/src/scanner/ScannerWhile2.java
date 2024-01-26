package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.print("첫 번쨰 숫자: ");
            int num1 = scn.nextInt();

            System.out.print("두 번쨰 숫자: ");
            int num2 = scn.nextInt();

            if (num1==0 && num2==0) {
                System.out.println("== 프로그램 종료 == ");
                break;
            }
            System.out.println("두 숫자의 합계  : " + (num1+num2));

        }
    }//main
}//class
