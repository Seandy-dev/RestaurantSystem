/*Address.java
 * AddressFactory entity
 *Author : Hlombekazi Mbelu 209024666
 * Date 11 June 2021
 */
package za.ca.cput.Factory;

import za.ca.cput.Entity.StaffDetails.Address;
import za.ca.cput.Util.GenericHelper;

public class AddressFactory {
    public static Address createAddress(String streetName , String suburb , String city ,
                                        String country ,  int streetNumber , int postalCode )
    {
       String addressId = GenericHelper.genericHelper();
        Address address= new Address.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setCountry(country)
                .setPostalCode(postalCode)
                .build();

        return address;
    }

}
