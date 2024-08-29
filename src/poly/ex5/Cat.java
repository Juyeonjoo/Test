package poly.ex5;

import poly.ex4.AbstractAnimal;

public class Cat implements InterfaceAnimal {

            @Override
            public void sound() {
                System.out.println("야옹");
            }

            @Override
            public void move() {
                System.out.println("고양이가 네 발로 걷습니다.");
            }
}
