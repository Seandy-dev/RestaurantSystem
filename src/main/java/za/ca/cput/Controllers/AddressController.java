package za.ca.cput.Controllers;
/* AddressEntity.java
   Author : Hlombekazi Mbelu (209024666)
   Date : 20 October 2021
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.Entity.StaffDetails.Address;
import za.ca.cput.Factory.AddressFactory;
import za.ca.cput.Services.AddressServices;

import java.lang.annotation.Documented;
import java.util.Set;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressServices addressServices;


    @PostMapping("/create")
    public Address create(@RequestBody  Address address)
    {
        Address address1 = AddressFactory.createAddress(address.getStreetName() , address.getSuburb(), address.getCity(),
                            address.getCountry(), address.getStreetNumber(), address.getPostalCode());
        return addressServices.create(address1);
    }

    @GetMapping("/read/{id}")
    public Address read(@PathVariable String id)
    {

        return addressServices.read(id);
    }

    @PostMapping("/update")
    public Address update(@RequestBody Address address)
    {

        return addressServices.update(address);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id)
    {
        return addressServices.delete(id);
    }

    @GetMapping("/getall/")
    public Set<Address> getAll(){
        return addressServices.getAll();
    }
}
