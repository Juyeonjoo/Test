package scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int temp;

        Scanner scn = new Scanner(System.in);
        System.out.print("첫 번째 숫자 : ");
        num1= scn.nextInt();
        System.out.print("두 번째 숫자 : ");
        num2= scn.nextInt();

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }
    }
}
