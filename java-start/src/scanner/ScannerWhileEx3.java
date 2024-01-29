package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner((System.in));
        int num=0;
        int sum=0;
        int count=1;
        while (( num = scn.nextInt() )!=-1) {

            System.out.print("숫자 입력 : ");

            if (num == -1) {
                System.out.println("입력 중단");
                break;
            }
            sum += num;
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + ((double) sum/count));
            count ++;
        }

    }
}
