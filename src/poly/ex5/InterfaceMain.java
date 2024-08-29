package poly.ex5;

import poly.ex4.AbstractAnimal;
import poly.ex5.Cat;
import poly.ex5.Caw;
import poly.ex5.Dog;

public class InterfaceMain {
    public static void main(String[] args) {
//        인터페이스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }//main

    private static void soundAnimal(InterfaceAnimal animal) {

        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
