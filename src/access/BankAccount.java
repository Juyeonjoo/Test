package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public 메서드: deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else{
            System.out.println("유효하지 않음");
        }
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount)&& balance - amount >=0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않음");
        }
    }

    public int getBalance() {
        return balance;
    }

    //private 메서드
    private boolean isAmountValid(int amount) {

        //금액이 0 보다 커야 함
        return amount > 0;
    }//
}
