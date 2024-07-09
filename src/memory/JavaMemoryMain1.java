package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {

//      메인을 제일 먼저 호출했으나 제일 마지막에 end 출력 -> 스택 구조
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }//main

    static void method1(int m1) {
//       method2 가장 늦게 호출> 가장 먼저 end
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }//method1

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}

