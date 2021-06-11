package za.ca.cput.Factory;
/*
ChefFactoryTest.java
Factory for the ChefFactoryTest
Author: Emihle Menzo 218337035
Date: 9 June
 */


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.Staff.Chef;

import static org.junit.jupiter.api.Assertions.*;

class ChefFactoryTest {

    @Test
    public void createChef(){
       Chef cf= ChefFactory.createChef( 955.28  ,  3);
        System.out.println(cf);


    }

    private Chef salary;
    private Chef yearsOfExperience;

    @BeforeEach
    void setUp() {
        salary = new Chef();
        yearsOfExperience = new Chef();

    }


    @Test
    public void testIdentity(){
        assertSame(salary, yearsOfExperience);

    }

    @Test
    public void testEquality() {
        assertEquals(salary, yearsOfExperience);
    }

    @Test
    @DisplayName(" Should be a failing test")
    public void shouldShowSimpleAssertion() {
        Assertions.assertEquals(salary, yearsOfExperience);


    }

    @Test
    @Disabled
    public void Disabled() {
        Assertions.assertEquals(salary, yearsOfExperience);
    }

    @Test
    public void testAddFail(){
        assertNotEquals(salary, yearsOfExperience);


     }



}