package za.ca.cput.Factory;
import za.ca.cput.Entity.StaffDetails.EmployeeAddress;

/* EmployeeAddress.java
 Entity for EmployeeAddressFactory
 Author: Nikitha Mbokotwana (218337906)
 Date: 09 June 2021
*/
public class EmployeeAddressFactory {
    public  static EmployeeAddress createEmployeeAddress(String employeeAddress, String addressId) {

        EmployeeAddress em = new EmployeeAddress.Builder()
                .setEmployeeAddress1(employeeAddress)
                .setAddressId(addressId)
                .build();
        return em;
    }
}
