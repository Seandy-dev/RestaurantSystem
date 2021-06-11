package za.ca.cput.Factory;
/*
ChefFactory.java
Factory for the chef factory
Author: Emihle Menzo 218337035
Date: 9 June 2021
 */

import za.ca.cput.Entity.Staff.Chef;

public class ChefFactory {

    public static Chef createChef(double Salary, int yearOfExperience){

        Chef cf = new Chef.Builder()
                .setSalary(Salary)
                .setYearsOfExperience(yearOfExperience)
                .build();

        return cf;


    }
}
