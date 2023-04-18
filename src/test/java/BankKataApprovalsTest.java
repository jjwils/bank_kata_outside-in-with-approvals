import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class BankAccountApprovalTest {



    // if you want to change the expected result,
    // move HikerTest.testAnswer.received.txt
    // to   HikerTest.testAnswer.approved.txt
    // to view the differences,
    // open HikerTest.testAnswer.diff
    @Test
    void printTransactions() throws Exception {

        BankAccount bankAccount = new BankAccount(new StatementPrinter(), new TransactionHistory());
        String actual = bankAccount.printStatement();
        Approvals.verify(
                actual);
    }
}
