package za.ca.cput.Factory;

/* EmployeeFactory.java
 * Thina Mbiza - 217217095
 * Date: 9 June 2021
 */

import za.ca.cput.Entity.Staff.Employee;
//import za.ca.cput.Util.GenericHelper;

public class EmployeeFactory {
    public static Employee createEmployee(String employeeID, String positionID, String firstName, String lastName){
        //   int employeeNumber = GenericHelper.genericID();
        Employee employee = new Employee.Builder()
                .setEmployeeID(employeeID)
                .setPositionID(positionID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
        return employee;
    }

    public static void main(String[] args) {

    }
}
