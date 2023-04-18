import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionsHistoryShould {


    @Test
    void record_a_deposit(){
        //arrange
        TransactionHistory transactionHistory = new TransactionHistory();
        Transaction deposit = new Transaction(LocalDate.of(2002,12,1), 500);

        //act
        transactionHistory.deposit(deposit);

        //assert
        assertEquals(1, transactionHistory.transactions().size());
        assertEquals(deposit, transactionHistory.transactions().get(0));

    }
}
