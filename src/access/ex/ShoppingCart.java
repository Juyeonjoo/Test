package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {

        if (itemCount >= items.length) {
            System.out.println("더 이상 추가할 수 없습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }//addItem

    public void display() {
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }//for

        System.out.println("전체 합계:" + calculateTotalPrice());
    }//display

    // 메서디 내부에서만 사용하므로 private 접근 제어자 사용
    private int calculateTotalPrice() {

        int totalPrice = 0 ;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }//for

        return totalPrice;
    }//calculateTotalPrice
}//class
