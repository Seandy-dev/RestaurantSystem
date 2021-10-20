package za.ca.cput.Factory;

/* WaiterFactoryTest.java
 Entity for WaiterFactoryTest
 Author: Sindiswa Nomusa Mbhele (219279616)
 Date: 11 June 2021
*/
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.Staff.Waiter;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class WaiterFactoryTest {

    Waiter hourlyWage, hours, tip;

        @Test
    public void createWaiter() {
        Waiter tbl = WaiterFactory.createWaiter( 21, 2, 90);
        System.out.println(tbl);
    }
    @Test
    public void testEquality(){

        Assertions.assertEquals(tip, hours);
    }


    @Test
    public void testIdentity() {
        assertSame(tip, hours);
    }

    @Test
    void timeoutExceeded(){
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    @Test
    @Disabled
    public  void testDisable(){
        fail("The test should be ignored because it is being developed. ");
    }

}