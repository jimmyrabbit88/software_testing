import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class RateParamFailTests {
    private double exp;
    private double amount;
    private int yrs;

    public RateParamFailTests(double exp, double amount, int yrs){
        this.exp = exp;
        this.amount = amount;
        this.yrs = yrs;
    }

    @Parameterized.Parameters (name="{index}: checkAmount({1}) = {0}")
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
                {1, 499, 2},
                {1, 10001, 2},
                {1, null, 2},
                {1, 0, 2},
                {1, "frank", 2},
                {1, 500, 0},
                {1, 1000, 6},
                {1, 5000, null},
                {1, 5001, "frank"},

        });
    }
    @Test(expected = IllegalArgumentException.class)
    public void testrate(){
        Loan loan = new Loan(amount, yrs);
        assertEquals(exp, loan.getRate(), 0.001);
    }


}