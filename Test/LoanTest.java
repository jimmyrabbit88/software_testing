import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class LoanTest {
    Loan loan = new Loan(1000, 2);

    //Test the constructor testing set/getAmount, set/getPeriod, set/getRate
    @Test
    public void TestAmount(){
        assertEquals(1000, loan.getAmount(), 0.0001 );
    }
    //Test the constructor testing set/getPeriod
    @Test
    public void TestPeriod(){
        assertEquals(2, loan.getPeriod());
    }
    //Test the constructor testing set/getAmount, set/getPeriod, set/getRate
    @Test
    public void TestRate(){
        assertEquals(10, loan.getRate(), 0.0001 );
    }

    //Tests for getMonthlyPayments that cant be used


    @Test(expected = IllegalArgumentException.class)
    public void TestSetAmount(){
        Loan loan2 = new Loan(-100, 2);
    }




}






