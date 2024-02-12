package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        System.out.println(average(1,2,3));
        System.out.println(average(10,20,30));
    }//main

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum/3.0;
    }//average()
}//class
