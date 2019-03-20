import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.*;


@RunWith(PowerMockRunner.class)
@PrepareForTest(Customer.class)
public class TakeOutLoanMockTest {
    @Test
    public void testLoan() throws Exception{

        Customer c = new Customer("bob");
        Loan mockLoan = EasyMock.createMock(Loan.class);
        PowerMock.expectNew(Loan.class, 5000.0, 5).andReturn(mockLoan);
        expect(mockLoan.getMonthlyPayment()).andReturn(43.33);
        PowerMock.replay(mockLoan, Loan.class);
        double exp = 43.33;
        c.takeoutloan();
        double res = c.getMonthlypayments();
        assertEquals(exp, res, 0.0001);
        PowerMock.verify(mockLoan, Loan.class);
    }




}
