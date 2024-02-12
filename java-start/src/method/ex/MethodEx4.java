package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner((System.in));

        int balance = 0;

        while (true) {

            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 프로그램 종료 ");
            System.out.print("옵션을 입력하세요: ");
            int opt = scn.nextInt();
            scn.nextLine();

            if (opt == 1) {
                System.out.print("입금 금액을 입력하세요: ");
                int deposit = scn.nextInt();
                balance = deposit(balance, deposit);
                System.out.println("입금금액 : "+ deposit + " 현재 금액 : "+balance);
            } else if (opt == 2) {
                System.out.print("출금 금액을 입력하세요: ");
                int withdraw = scn.nextInt();
                balance = withdraw(balance, withdraw);
                System.out.println("출금금액 : "+ withdraw + " 현재 금액 : "+balance);

            } else if (opt == 3) {
                System.out.println("잔액 확인: "+ balance);
            } else if (opt == 4) {
                System.out.println("프로그램 종료");
                return;
            } else System.out.println("잘못 입력하셨습니다.");;

        }//while
    }//main

    public static int deposit(int bal, int amt) {
        bal += amt;
        return bal;
    }//

     public static int withdraw(int bal, int amt) {
         if (bal >= amt) {
             bal -= amt;
             return bal;
         } else {
             System.out.println("잔액 부족");
             return bal;
         }
    }//withdraw


}//class
