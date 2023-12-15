package variable;

public class Var8 {

    public static void main(String[] args) {

        //정수
        byte b= 127; // -128 ~ 127 (1byte, 2⁸), 파일 전송, 파일 복사 등에 주로 사용됨
        short s = 32767; // -32,768 ~ 32,767 (2byte, 2¹⁶)
        int i = 2147483647;// 21억 -2,147,483,648 ~ 2,147,483,647 (약 20억) (4byte, 2³²)

        long l = 2147483648L;//-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8byte, 2⁶⁴)

        //실수
        float f = 10.0f; //표현 정밀도가 낮다.
        double d = 10.0;//double 더 큰 실수의 범위를 사용할 수 있음, 정밀도가 float 보다 높음

        //기타
        boolean bool = true; //1byte
        char charr = 'A'; //1byte
        String str ;//메모리 사용량은 문자 길이에 따라 동적으로 달라짐

    }
}
