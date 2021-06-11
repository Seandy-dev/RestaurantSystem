package za.ca.cput.Factory;
import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.StaffDetails.EmployeeAddress;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressFactoryTest {
  private EmployeeAddress employeeAddress;
    private EmployeeAddress addressId;
//Factory test
    @Test
    public void createEmployeeAddress()
    {
        EmployeeAddress employeeAddress = EmployeeAddressFactory.createEmployeeAddress("16 Adline Road", "16ADR");
        System.out.println(employeeAddress);

    }
    @Test
    void testEquality() {

        assertEquals(employeeAddress, addressId);
    }

    //Test Identity
    @Test
    void testIdentity(){
        assertSame(employeeAddress, addressId);

    }
    //Timeout
    @Test
    void test_Add() throws Exception{
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Time out");
    }
    //Test Disable
    @Test
    void temporarilyDisabledTest() throws Exception{
        System.out.println(" Disabling test but still under development ");
    }


}