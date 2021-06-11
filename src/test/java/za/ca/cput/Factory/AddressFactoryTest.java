/*Address.java
 * AddressFactory entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 11 June 2021
 */

package za.ca.cput.Factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ca.cput.Entity.StaffDetails.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    Address address = AddressFactory.createAddress("", 330,"Mkonto",
            "Khayelitsha" , "Cape Town", "South Africa", 7784);
    @Test
    public void addressTest()
    {
        Assertions.assertEquals(address , address);

        Assertions.assertSame(address , address);

    }


    @Test
    @Disabled
    public void disableTest()
    {
        Assertions.assertEquals(address , address);
    }

    @Test
    @Timeout(value = 1000 )
    public void testTimeOut()
    {
        Assertions.assertEquals(address, address);
    }
}