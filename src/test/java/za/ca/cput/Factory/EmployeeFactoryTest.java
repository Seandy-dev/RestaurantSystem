package za.ca.cput.Factory;

/* EmployeeFactoryTest.java
 * Thina Mbiza - 217217095
 * Date: 9 June 2021
 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.Staff.Employee;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeFactoryTest {

    @Test
    public void createEmployee(){
        Employee employee = EmployeeFactory.createEmployee("45213165495", "Chef", "Thina", "Mbiza");
        System.out.println(employee);
    }


    @Test
    public void testForEquality(){
        Assertions.assertEquals("Thina", "Thina");
    }

    @Test
    public void testForIdentity(){
        Assertions.assertSame("Mbiza", "Mbiza");
    }

    @Test
    @org.junit.jupiter.api.Timeout(value = 1000, unit = TimeUnit.NANOSECONDS)
    public void testTimeout(){
        System.out.println("Setting the Timeout");
    }

    @Test
    @Disabled
    public void testDisable(){
        org.junit.jupiter.api.Assertions.fail("This test should fail. Program still being developed");
    }
}