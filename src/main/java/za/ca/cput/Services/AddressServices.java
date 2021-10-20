package za.ca.cput.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ca.cput.Entity.StaffDetails.Address;
import za.ca.cput.Repository.AddressRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
   public class AddressServices  implements IAddressServices
   {
        private static AddressServices addressServices ;
        @Autowired
        private AddressRepository repository;

       @Override
       public Set<Address> getAll() {
           return this.repository.findAll().stream().collect(Collectors.toSet());
       }

       @Override
       public Address create(Address address) {
           return this.repository.save(address);
       }

       @Override
       public Address read(String addressId) {
           return this.repository.findById(addressId).orElse(null);
       }

       @Override
       public Address update(Address address) {
           if(this.repository.existsById(address.getAddressId()))
               return this.repository.save(address);
           return null;
       }


       @Override
       public boolean delete(String id) {
           this.repository.deleteById(id);
           if(this.repository.existsById(id))
               return false;
           else
               return true;
       }
   }
