package za.ca.cput.Factory;
/*
CustomerInvoiceFactory.java
Factory for the customer Invoice
Author: Emihle Menzo 218337035
Date: 9 June
 */

import za.ca.cput.Entity.Order.CustomerInvoice;



public class CustomerInvoiceFactory {

    public static CustomerInvoice createCustomerInvoice(long InvoiceDate, double OrderAmount) {

        CustomerInvoice CI = new CustomerInvoice.Builder()
                .setInvoiceDate(InvoiceDate)
                .setOrderAmount(OrderAmount)
                .build();

        return CI;
    }
}