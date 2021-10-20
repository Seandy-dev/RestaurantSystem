package za.ca.cput.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.Order.Order;
import static org.junit.jupiter.api.Assertions.*;

/* OrderFactoryTest.java
   Order Factory Test
   Author : Devon Sherwyn May (219168296)
   Date : 11 June 2021
*/

class OrderFactoryTest
{
    Order Order1;
    Order Order2;
    Order Order3;

    @BeforeEach
    void setUp()
    {
        Order1 = OrderFactory.createOrder(11,20210610 );
        Order2 = OrderFactory.createOrder(9,20210611 );
        Order3 = Order1;
    }

    @Test
    void testIdentity()              //Tests Identity
    {
        assertSame(Order1,Order3);
    }

    @Test
    void testEqual()         // Test Equality
    {
        assertEquals(Order1, Order3);
    }

    @Test
    void testNotEqual()         // Test not Equal
    {
        assertNotEquals(Order1, Order2);
    }

    @Timeout(3)
    @Test
    void testTimeoutLoop() throws Exception      // Tests timeout after 3 seconds
    {
        while (true)
        {
            Thread.sleep(1000);
        }
    }

    @Test
    @Disabled("Test disabled")
    void testDisabled()
    {
        assertEquals(Order1, Order3);
    }
}