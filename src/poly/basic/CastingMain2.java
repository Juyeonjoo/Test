package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
//        단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
//        poly.childMethod();

        Child child = (Child) poly;
        child.childMethod();

        //일시적다운캐스팅
//        poly는 Parent 타입이다. 이 코드를 실행하면 Parent 타입을 임시로 Child로 변경한다.
//        그리고 메서드를 호출할 때 Child 타입에서 찾아서 실행한다.
        ((Child) poly).childMethod();
    }
}
