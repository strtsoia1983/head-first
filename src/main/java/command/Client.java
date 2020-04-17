package command;

public class Client {

    public static void main(String[] args) {
        AccountA accountA = new AccountA(1000);
        AccountB accountB = new AccountB(500);
        double transferMount = 100;
        WithdrawAccountA withdrawAccountA = new WithdrawAccountA(accountA, transferMount);
        DepositAccountB depositAccountB = new DepositAccountB(accountB, transferMount);

        Bank bank = new Bank();
        bank.transferAToB(withdrawAccountA, depositAccountB, false);

        System.out.println("Balance of Account A is: " + accountA.getBalance());
        System.out.println("Balance of Account  is: " + accountB.getBalance());

        bank.transferAToB(withdrawAccountA, depositAccountB, true);

        System.out.println("Balance of Account A is: " + accountA.getBalance());
        System.out.println("Balance of Account  is: " + accountB.getBalance());
    }
}
