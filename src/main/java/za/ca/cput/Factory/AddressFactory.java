package za.ca.cput.Factory;

import za.ca.cput.Entity.StaffDetails.Address;
import za.ca.cput.Util.GenericHelper;

public class AddressFactory {
    public static Address createAddress(String addressId, int streetNumber, String streetName,String suburb,
                                        String city, String country , int postalCode )
    {
        addressId = GenericHelper.genericHelper();
        Address address = new Address.Builder()
                .setAddressId(addressId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setCountry(country)
                .setPostalCode(postalCode);

        return address;
    }
}
