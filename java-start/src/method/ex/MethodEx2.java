package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "hello world";
        printMesg(message, 3);
    }//main

    public static void printMesg(String msg, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(msg);
        }
    }//printMesg()
}//class
