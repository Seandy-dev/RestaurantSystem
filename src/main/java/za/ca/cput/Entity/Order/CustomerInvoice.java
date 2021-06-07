/*CustomerInvoice.java
Entity for the customerInvoice
Author: Emihle Menzo 218337035
Date: 7 June 2021
 */

package za.ca.cput.Entity.Order;

import za.ca.cput.Entity.Staff.Chef;

public class CustomerInvoice {

    private int InvoiceDate;
    private double OrderAmount;


    private CustomerInvoice(CustomerInvoice.Builder builder) {
        this.InvoiceDate = builder.InvoiceDate;
        this.OrderAmount = builder.OrderAmount;;

    }

    @Override
    public String toString() {
        return "CustomerInvoice{" +
                "InvoiceDate='" + InvoiceDate + '\'' +
                ", OrderAmount='" + OrderAmount + '\'' +
                '}';
    }

    public static class Builder {
        private int InvoiceDate;
        private double OrderAmount;

        public CustomerInvoice.Builder setInvoiceDate(int InvoiceDate) {
            this.InvoiceDate = InvoiceDate;
            return this;
        }

        public CustomerInvoice.Builder setOrderAmount(double OrderAmount) {
            this.OrderAmount = OrderAmount;
            return this;
        }



        public CustomerInvoice.Builder copy(CustomerInvoice CustomerInvoice) {
            this.InvoiceDate = CustomerInvoice.InvoiceDate;
            this.OrderAmount = CustomerInvoice.OrderAmount;
            return this;
        }

        public CustomerInvoice build() {

            return new CustomerInvoice(this);
        }
    }
}
