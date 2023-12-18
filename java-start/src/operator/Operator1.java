package operator;

public class Operator1 {

    public static void main(String[] args) {
        
        //변수 초기화
        int a =5;
        int b = 2;
        
        //덧셈
        int sum = a+b;
        System.out.println("sum = " + sum);
        
        int div = a/b;
        System.out.println("div = " + div); // 몫
        
        //나머지
        int mod = a%b;// 5/2 몫 2: 나머지 1
        System.out.println("mod = " + mod);
    }//main
}//class
