package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.print("이름 입력 : ");
            String name = scn.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이 입력 : ");
            int age = scn.nextInt();//줄바꿈이 남아 있음.
            scn.nextLine();//라인을 읽어줌. 숫자 입력 후의 줄바꿈 처리

            System.out.println("입력한 이름 : "+ name + " 나이 : " + age);

        }

    }
}
