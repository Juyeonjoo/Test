package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {

        //부모는 자식을 담을 수 있음.
        //Parent 타입 child 객체 생성
        Parent parent1 = new Child();
//        자식 클래스(Child)의 객체를 부모 클래스(Parent) 타입으로 참조하는 것
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //실행시 오류 발생, 런타임 오류, ClassCastException
        child2.childMethod(); // 실행불가

    }
}
