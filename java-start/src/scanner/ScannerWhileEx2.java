package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        while (true) {

            System.out.print("상품의 가격 : ");
            int price = scn.nextInt();

            if (price == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("상품의 수량 : ");
            int qnt = scn.nextInt();

            System.out.println("총 비용 : " + price * qnt);
        }
    }
}
