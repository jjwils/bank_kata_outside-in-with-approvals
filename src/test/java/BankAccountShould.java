import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;


@ExtendWith({MockitoExtension.class})
public class BankAccountShould {

    BankAccount bankAccount;

    @Mock
    TransactionHistory transactionHistory;

    @Mock
    StatementPrinter statementPrinter;


    @BeforeEach
    void setup(){

         bankAccount = new BankAccount(statementPrinter, transactionHistory);

    }

    @Test
    void print_transactions(){

        //arrange

        //act

        bankAccount.printStatement();

        //assert

        verify(statementPrinter).print();

    }

    @Test
    void get_transactions(){

        //arrange

        //act

        bankAccount.transactions();

        //assert

        verify(transactionHistory).transactions();

    }
}
