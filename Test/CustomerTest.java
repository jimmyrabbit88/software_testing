import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer c1 = new Customer();
    Customer c2 = new Customer("tom");
    Customer c3 = new Customer( "bob", 100.67);
    //Test the constructor testing set/getAmount, set/getPeriod, set/getRate
    @Test
    public void  TestName0(){
        assertEquals("Name unknown", c1.getName());
    }
    @Test
    public void  TestName1(){
        assertEquals("tom", c2.getName());
    }
    @Test
    public void  TestName2(){
        assertEquals("bob", c3.getName());
    }

    @Test
    public void TestMPayments1(){
        assertEquals(0.0, c1.getMonthlypayments(), 0.0001);
    }
    @Test
    public void TestMPayments2(){
        assertEquals(0.0, c2.getMonthlypayments(), 0.0001);
    }
    @Test
    public void TestMPayments3(){
        assertEquals(100.67, c3.getMonthlypayments(), 0.0001);
    }

    @Test
    public void TestToString(){
        assertEquals("Name: bob Payments: 100.67", c3.toString());
    }



}