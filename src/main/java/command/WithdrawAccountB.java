package command;

public class WithdrawAccountB implements Command {
    private AccountB accountB;
    private double withdrawAmount;

    public WithdrawAccountB(AccountB accountB, double withdrawAmount) {
        this.accountB = accountB;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void execute() {
        System.out.println("execute WithdrawAccountB");
        this.accountB.withDraw(withdrawAmount);
    }

    @Override
    public void undo() {
        System.out.println("undo WithdrawAccountB");
        this.accountB.deposit(withdrawAmount);
    }
}
