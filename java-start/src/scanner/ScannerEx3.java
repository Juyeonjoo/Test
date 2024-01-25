package scanner;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("메뉴 : ");
        String food = scn.nextLine();

        System.out.print("가격 : ");
        int price  = scn.nextInt();

        System.out.print("수량 : ");
        int quantity  = scn.nextInt();

        System.out.println(food+"의 총 가격은 "+ price*quantity);



    }
}
