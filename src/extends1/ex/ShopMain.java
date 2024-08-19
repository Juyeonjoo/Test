package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("어린왕자", 10000, "생텍쥐페리", "123456");
        Album album = new Album("썸머향기", 20000, "아이유");
        Movie movie = new Movie("겨울왕국", 30000, "크리스 벅", "크리스틴 벨");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합 : " + sum);
    }
}
