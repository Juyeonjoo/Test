package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int sum = 0;

        while (true) {

                System.out.print("숫자 입력 : ");
                int num = scn.nextInt();

                if (num == 0) {
                    System.out.println("입력한 숫자 : " + num);
                    System.out.println("== 프로그램 종료 == ");
                    break;
                }
                sum += num;
            }
        System.out.println("숫자 합계 : "+sum);

    }//main
}//class
