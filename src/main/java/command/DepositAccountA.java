package command;

public class DepositAccountA implements Command {
    private AccountA accountA;
    private double depositAmount;

    public DepositAccountA(AccountA accountA, double depositAmount) {
        this.accountA = accountA;
        this.depositAmount = depositAmount;
    }


    @Override
    public void execute() {
        System.out.println("execute DepositAccountA");
        this.accountA.deposit(depositAmount);
    }

    @Override
    public void undo() {
        System.out.println("undo DepositAccountA");
        this.accountA.withDraw(depositAmount);
    }
}
