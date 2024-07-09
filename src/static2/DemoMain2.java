package static2;

public class DemoMain2 {

    public static void main(String[] args) {
        String s = "hello Java";

        String deco = DecoUtil2.deco(s); // 객체 생성 없이 클래스명 + 메서드명으로 호출가능

        System.out.println("b e f o r e : " + s);
        System.out.println("after : " + deco);
    }
}
