/*Address.java
 * AddressFactory entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 11 June 2021
 */

package za.ca.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.StaffDetails.Address;

import static org.junit.jupiter.api.Assertions.*;

class AddressFactoryTest {

    @Test
    public void addressTest()
    {
        Address address = AddressFactory.createAddress("", 330,"Mkonto",
                "Khayelitsha" , "Cape Town", "South Africa", 7784);
        System.out.println(address);
    }

}