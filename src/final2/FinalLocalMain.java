package final2;

public class FinalLocalMain {
    public static void main(String[] args) {

        //final 지역변수
        final int data1;
        data1 = 10; // 최초 한번만 할당
//        data1 = 20; 컴파일 오류,

        method(10);
    }

    static void method(final int i) {
//        i = 20; // 매개변수야 final 붙으면 메서드 내부에서 매개변수의 값을 변경할 ㅜㅅ 없음.
//        메서드 호출시점에 사용된 값이 끝까지 사용 됨

    }
}
