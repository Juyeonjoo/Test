package scanner;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("구구단 단수 : ");
        int number = scn.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x "+ i +"= " + number*i);
        }

    }
}
