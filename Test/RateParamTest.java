import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class RateParamTest {
    private double exp;
    private double amount;
    private int yrs;

    public RateParamTest(double exp, double amount, int yrs){
        this.exp = exp;
        this.amount = amount;
        this.yrs = yrs;
    }

    @Parameterized.Parameters (name="{index}: checkAmount({1}) = {0}")
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
                {10, 500, 2},
                {10, 1000, 2},
                {10, 5000, 2},
                {10, 1000, 1},
                {10, 1000, 3},
                {8, 5001, 2},
                {8, 8000, 2},
                {8, 10000, 2},
                {6, 500, 4},
                {6, 1000, 4},
                {6, 5000, 4},
                {5, 5001, 4},
                {5, 8000, 4},
                {5, 10000, 4},

        });
    }
    @Test
    public void testrate(){
        Loan loan = new Loan(amount, yrs);
        assertEquals(exp, loan.getRate(), 0.001);
    }


}