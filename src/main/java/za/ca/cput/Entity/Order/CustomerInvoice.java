/*CustomerInvoice.java
Entity for the customerInvoice
Author: Emihle Menzo 218337035
Date: 7 June 2021
 */

package za.ca.cput.Entity.Order;


import java.util.Date;

public class CustomerInvoice {

    private Date InvoiceDate;
    private double OrderAmount;


    private CustomerInvoice(Builder builder) {
        this.InvoiceDate = builder.InvoiceDate;
        this.OrderAmount = builder.OrderAmount;

    }

    @Override
    public String toString() {
        return "CustomerInvoice{" +
                "InvoiceDate='" + InvoiceDate + '\'' +
                ", OrderAmount='" + OrderAmount + '\'' +
                '}';
    }

    public static class Builder {
        private Date InvoiceDate;
        private double OrderAmount;

        public CustomerInvoice.Builder setInvoiceDate(Date InvoiceDate) {
            this.InvoiceDate = InvoiceDate;
            return this;
        }

        public CustomerInvoice.Builder setOrderAmount(double OrderAmount) {
            this.OrderAmount = OrderAmount;
            return this;
        }


        public CustomerInvoice.Builder copy(CustomerInvoice customerInvoice) {
            this.InvoiceDate = customerInvoice.InvoiceDate;
            this.OrderAmount = customerInvoice.OrderAmount;
            return this;
        }

        public CustomerInvoice build() {

            return new CustomerInvoice(this);
        }
    }
}
