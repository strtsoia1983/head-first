package command;

public class WithdrawAccountA implements Command {
    private AccountA accountA;
    private double withdrawAmount;

    public WithdrawAccountA(AccountA accountA, double withdrawAmount) {
        this.accountA = accountA;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void execute() {
        System.out.println("execute WithdrawAccountA");
        this.accountA.withDraw(withdrawAmount);
    }

    @Override
    public void undo() {
        System.out.println("undo WithdrawAccountA");
        this.accountA.deposit(withdrawAmount);
    }
}
