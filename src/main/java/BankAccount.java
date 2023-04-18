public class BankAccount {
    private StatementPrinter statementPrinter;
    private TransactionHistory transactions;

    public BankAccount(StatementPrinter statementPrinter, TransactionHistory transactions) {
        this.statementPrinter = statementPrinter;
        this.transactions = transactions;
    }


    public String printStatement() {

      return statementPrinter.print();

    }

    public void transactions() {
        throw new UnsupportedOperationException();
    }
}
