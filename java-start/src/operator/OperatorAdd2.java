package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        //전위 증감 연산자 : 증감 연산이 먼저 수행된 후 연산 수행
        int a= 1;
        int b =0;

        b= ++a; // == a=a+1과 동일 a의 값을 먼저 증가시키고 그 결과를 b 에 대입
        System.out.println("a = " + a + ", b = " + b);
        //a : 2, b : 2

        //후위증감연산자 : 다른 연산 먼저 수행된 후 증감연산 수행됨
        a = 1;
        b = 0;

        b = a++; //a의 현재 값을 b 에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); //a:2, b=1
    }
}//class
