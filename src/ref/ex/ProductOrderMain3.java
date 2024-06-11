package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("주문할 상품의 개수를 입력하세요: ");
        int n = scanner.nextInt(); //
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.print("상품명을 입력하세요: ");
            String productName = scanner.nextLine();
            System.out.print("가격을 입력하세요: ");
            int price = scanner.nextInt();
            System.out.print("수량을 입력하세요: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드
            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    } //main

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }//createOrder

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }//printOrders

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }//getTotalAmount

}//class
