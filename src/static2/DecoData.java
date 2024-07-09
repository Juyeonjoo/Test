package static2;

public class DecoData {

    private int instanceValue;

    // 정적 변수
    private static int staticValue;  // static 소속


//    정적 메서드, 정적 변수 접근
//      static 소속
    public static void staticCall() {

//        instanceValue++; //인스턴스 변수 접근 불가
//        instanceMethod(); //인스턴스 메서드 접근 불가
        staticValue++; //정적변수접근
        staticMethod();//정적 메서드 접근
    }

//    외부에서 참조값 넘겨옴
    public static void staticCall(DecoData data) {

        data.staticValue++; //정적변수접근
        data.staticMethod();//정적 메서드 접근
    }

    public void instanceCall() {
//      본인의 인스턴스 값 불러서 사용
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적변수접근
        staticMethod();//정적 메서드 접근
    }
    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

//    정적 메서드
    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }


}
