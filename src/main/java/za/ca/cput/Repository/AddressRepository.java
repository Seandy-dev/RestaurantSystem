package za.ca.cput.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.Entity.StaffDetails.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, String> {
}
