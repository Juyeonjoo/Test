package static2;

public class DecoUtil2 {

//   메서드 앞에 static이 붙어있음
//    정적 메서드가 됨. 클래스 소속이 됨. -> 인스턴스 생성 없이 사용 가능
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
