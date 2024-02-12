package method.ex;

public class MethodEx3Ref {

    public static void main(String[] args) {

        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종금액 : " + balance);
    }//main

    public static int deposit(int balance, int amt) {

//        balance = balance + amt;
        balance += amt;
        return balance;
    }//deposit

    public static int withdraw(int balance, int amt) {
//        balance = balance - amt;
        if (balance >= amt) {
            balance -= amt;
        } else {
            System.out.println("잔액 부족");
        }
        return balance;
    }//withdraw()
}//class
