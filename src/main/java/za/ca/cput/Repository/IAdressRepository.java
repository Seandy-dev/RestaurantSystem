package za.ca.cput.Repository;

import za.ca.cput.Entity.StaffDetails.Address;

import java.util.Set;
@Deprecated
public interface IAdressRepository extends IRepository<Address, String> {
    public Set<Address> getAll();
}
