package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("int : " + add(3, 10));
        System.out.println("double : "+ add(5.0, 7.0));
    }

    public static double add(double a, double b) {
        System.out.println("double 호출: ");
        return a + b;
    }//
}
