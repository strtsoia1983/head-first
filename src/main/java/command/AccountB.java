package command;

public class AccountB {

    double balance;

    public AccountB(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
    }

    public void withDraw(double withDrawAmount) {
        this.balance = this.balance - withDrawAmount;
    }

    public double getBalance() {
        return this.balance;
    }
}
