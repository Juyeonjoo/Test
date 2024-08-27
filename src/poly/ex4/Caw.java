package poly.ex4;

public class Caw extends AbstractAnimal {

        @Override
        public void sound() {
            System.out.println("음매");
        }

    @Override
    public void move() {
        System.out.println("소가 네 발로 걷습니다.");
    }
}
