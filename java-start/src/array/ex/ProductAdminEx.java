package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {

        Scanner scn = new Scanner((System.in));
        int productCnt =0;
        int product = 3;
        String[] name = new String[product];
        int[] price = new int[product];

        while (true) {
            System.out.println("1. 상품입력 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = scn.nextInt();
            scn.nextLine();

            if (menu == 1) {
                if (productCnt >= 3) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름 입력: ");
                name[productCnt] = scn.nextLine();

                System.out.print("상품 가격 입력: ");
                price[productCnt] = scn.nextInt();

                for (int i =0; i< productCnt; i++) {
                    System.out.println("상품이름 : "+name[i]+" 상품 가격: "+ price[i]);
                }
                productCnt++;
            } else if (menu == 2) {
                if (productCnt ==0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i =0; i< productCnt; i++) {
                    System.out.println("상품이름 : "+name[i]+" 상품 가격: "+ price[i]);
                }
            } else if (menu == 3) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            } else System.out.println("잘못입력하셨습니다.");

        }//while
    }//main
}//class
