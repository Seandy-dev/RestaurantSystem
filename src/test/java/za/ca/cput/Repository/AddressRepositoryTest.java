//package za.ca.cput.Repository;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ca.cput.Entity.StaffDetails.Address;
//import za.ca.cput.Factory.AddressFactory;
//
//import static org.junit.jupiter.api.Assertions.*;
//@TestMethodOrder(MethodOrderer.MethodName.class)
//
//class AddressRepositoryTest {
//    public static AddressRepository addressRepository = AddressRepository.getAddressRepository();
//    private static Address address = AddressFactory.createAddress("e331 Mkhonto Crescent", "Khayelitsha"
//                      , "Cape Town" , "South Africa" , 1 , 7784);
//
//    @Test
//    void create() {
//        Address created = addressRepository.create(address);
//        assertEquals(created.getAddressId(), address.getAddressId());
//        System.out.println("Create : " + created);
//    }
//
//    @Test
//    void read() {
//        Address read = addressRepository.read(address);
//        assertNull(read);
//        System.out.println("Read : " + read);
//    }
//
//    @Test
//    void update() {
//       Address updated = new Address.Builder().copy(address).setDescription("Black").build();
//       assertNull(addressRepository.update(updated));
//        System.out.println("Update : " + updated);
//    }
//
//    @Test
//    void delete() {
//        boolean success = addressRepository.delete(address.getAddressId());
//        assertNotNull(success);
//        System.out.println("Delete : " + success);
//    }
//
//    @Test
//    void getAll() {
//        System.out.println("Show all : ");
//        System.out.println(addressRepository.getAll());
//    }
//}