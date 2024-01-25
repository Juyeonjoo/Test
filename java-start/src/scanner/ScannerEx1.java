package scanner;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("이름  : ");
        String name = scn.nextLine();

        System.out.print("나이  : ");
        int age = scn.nextInt();

        System.out.println("이름은 : " + name +"이고, 나이는 " + age + "입니다. " );



    }
}
