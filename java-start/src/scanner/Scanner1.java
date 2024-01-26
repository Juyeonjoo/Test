package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();// 엔터를 치기까지 string을 가지고 온다.
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수 입력: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수 : "+ intValue);

        System.out.print("double 입력: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 double : "+   doubleValue);

    }
}
