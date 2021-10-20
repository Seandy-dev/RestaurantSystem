package za.ca.cput.Services;
/* AddressEntity.java
   Author : Hlombekazi Mbelu (209024666)
   Date : 20 October 2021
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ca.cput.Entity.StaffDetails.Address;
import za.ca.cput.Factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AddressServicesTest {

    private AddressServices addressServices;
    private static Address address = AddressFactory.createAddress("e331 Mkhonto Crescent", "Khayelitsha"
           , "Cape Town" , "South Africa" , 1 , 7784);

   @Test
   void create() {
        Address created = addressServices.create(address);
        System.out.println("Create: " + created);

    }

    @Test
    void update() {
        Address old = addressServices.read(" ");
       Address updated = new Address.Builder().copy(old).setAddressId("").setStreetNumber(52).setSuburb("")
               .setCity("").setPostalCode(7784).setStreetName("").setCountry("").build();
       assertNull(addressServices.update(updated));
        System.out.println("Updated: " + updated);
   }

   @Test
   void read() {
        Address read = addressServices.read(address.getAddressId());
        assertNotNull(read);
        System.out.println("Read: " + read);
  }

   @Test
  void delete() {
       boolean success = addressServices.delete("");
      assertFalse(success);
     System.out.println("Delete: " + success);
   }

    @Test
    void getAll(){

  }
}