package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 1 : ");
        int num1 = scanner.nextInt();

        System.out.print("숫자 2 : ");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println(num1);
        } else if (num1<num2){System.out.println(num2);}
        else {
            System.out.println("두 숫자는 같습니다. ");
        }

        int val = (num1 > num2) ? num1 : num2;
        System.out.println(val);
        System.out.println((num1>num2) ? num1 : num2);

    }
}
