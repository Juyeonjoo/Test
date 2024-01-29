package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int cost=0;

        while (true) {
            System.out.print("1. 상품입력 , 2: 결제, 3: 프로그램 종료: ");
            int opt = scn.nextInt();
            scn.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("상품명: ");
                    String name = scn.nextLine();
                    System.out.print("상품 가격: ");
                    int price = scn.nextInt();
                    System.out.print("구매 수량: ");
                    int qnt = scn.nextInt();

                    System.out.println("상품명 : " + name + " 상품 가격 : " + price + "수량 : " + qnt + " 합계 : " + price*qnt);
                    cost += price*qnt;

                    break;
                case 2:
                    System.out.println("가격: " + cost);
                    break;
                case 3:
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
                    break;
                }//switch
        }//while
    }//main
}//class
