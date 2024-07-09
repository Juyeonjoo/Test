package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData decoData2 = new DecoData();
//        인스턴스 값 새로 만들어지니까

        decoData2.instanceCall();
        staticCall(decoData2);

        DecoData decoData1 = new DecoData();
        staticCall();
        //위와 동일한 결과 도출됨
        staticCall();
    }
}//class
