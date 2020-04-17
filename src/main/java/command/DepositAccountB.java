package command;

public class DepositAccountB implements Command {
    private AccountB accountB;
    private double depositAmount;

    public DepositAccountB(AccountB accountB, double depositAmount) {
        this.accountB = accountB;
        this.depositAmount = depositAmount;
    }

    @Override
    public void execute() {
        System.out.println("execute DepositAccountB");
        this.accountB.deposit(this.depositAmount);
    }

    @Override
    public void undo() {
        System.out.println("undo DepositAccountB");
        this.accountB.withDraw(this.depositAmount);
    }
}
