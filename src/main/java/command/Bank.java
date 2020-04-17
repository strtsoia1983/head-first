package command;

import java.util.Stack;

public class Bank {

    private final Stack<Command> executedDepositCommands = new Stack<>();

    public void transferAToB(WithdrawAccountA c1, DepositAccountB c2, boolean exceptionOccur) {
        try {
            c1.execute();
            this.executedDepositCommands.push(c1);
            if (exceptionOccur) {
                throw new RuntimeException("Network issue.");
            }
            c2.execute();
            this.executedDepositCommands.push(c2);
        } catch (Throwable e) {
            executedDepositCommands.forEach(t -> t.undo());
        } finally {
            executedDepositCommands.clear();
        }

    }
}
