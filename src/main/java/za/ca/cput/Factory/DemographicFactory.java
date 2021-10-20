package za.ca.cput.Factory;
/* Demographic.java
 Entity for DemographicFactory
 Author: Nikitha Mbokotwana (218337906)
 Date: 09 June 2021
*/
import za.ca.cput.Entity.StaffDetails.Demographic;

public class DemographicFactory {
    public  static Demographic createDemographic(String gender, long birthDate) {

        Demographic demographic = new Demographic.Builder()
                .setBirthDate(birthDate)
                .setGender(gender)
                .build();
        return demographic;
    }

}
