package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue=2147483647;//int 최고값
        long maxIntOver=2147483648L;//int 최고값

        int intValue=0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting =  " +intValue);

        //overFlow
        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting =  " +intValue);//int 보다 1초과한 값 int에 넣기 -2147483648 , int의 제일 작은 범위. int의 가장 작은범위부터 다시 시작
        System.out.println("test");
    }
}
