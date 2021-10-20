package za.ca.cput.Factory;
/* Demographic.java
 Entity for DemographicFactoryTest
 Author: Nikitha Mbokotwana (218337906)
 Date: 09 June 2021
*/
import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.StaffDetails.Demographic;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class DemographicFactoryTest {
 private Demographic gender;
 private Demographic birthDate;

 //Factory test
    @Test
    public void createDemographic() {

        Demographic demographic = DemographicFactory.createDemographic("Female", 1999-03-21);
        System.out.println(demographic);
 }
 //Test Equality
 @Test
    void testEquality() {

     assertEquals(gender, birthDate);
 }

 //Test Identity
    @Test
    void testIdentity(){
     assertSame(gender, birthDate);

    }
 //Timeout
 @Test
 void test_Add() throws Exception{
     TimeUnit.SECONDS.sleep(10);
     System.out.println("Time out");
 }
 //Test Disabled
 @Test
 void temporarilyDisabledTest() throws Exception{
        System.out.println(" Disabling test but still under development ");
    }

}