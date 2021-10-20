package za.ca.cput.Services;

import za.ca.cput.Entity.StaffDetails.Address;

import java.util.Set;

public interface IAddressServices extends IServices<Address, String>{

    public Set<Address> getAll();

}
