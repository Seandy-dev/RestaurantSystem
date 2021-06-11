package za.ca.cput.Factory;
/*
CustomerInvoiceFactoryTest.java
Factory for the customerInvoiceTest
Author: Emihle Menzo 218337035
Date: 9 June
 */

import org.junit.jupiter.api.*;
import za.ca.cput.Entity.Order.CustomerInvoice;
import static org.junit.jupiter.api.Assertions.*;

class CustomerInvoiceFactoryTest {


    @Test
    public void createCustomerInvoice() {
        CustomerInvoice CI = CustomerInvoiceFactory.createCustomerInvoice (2021/06/10, 250.55);
        System.out.println(CI);

    }
    private CustomerInvoice InvoiceDate;
    private CustomerInvoice OrderAmount;

    @BeforeEach
    void setUp() {
        InvoiceDate = new CustomerInvoice();
        OrderAmount = new CustomerInvoice();
    }


        @Test
    public void testIdentity(){
        assertSame(InvoiceDate, OrderAmount);

    }

    @Test
    public void testEquality() {
        assertEquals(InvoiceDate, OrderAmount);
    }

    @Test
    @DisplayName("test failing ")
    public void shouldShowSimpleAssertion() {
        Assertions.assertEquals(InvoiceDate, OrderAmount);


    }

    @Test
    @Disabled
    public void Disabled() {
        Assertions.assertEquals(InvoiceDate, OrderAmount);
    }

    @Test
    public void testAddFail(){
        assertNotEquals(InvoiceDate, OrderAmount);


    }



}










