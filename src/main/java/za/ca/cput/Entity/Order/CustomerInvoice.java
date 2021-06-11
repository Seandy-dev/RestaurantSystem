/*CustomerInvoice.java
Entity for the customerInvoice
Author: Emihle Menzo 218337035
Date: 7 June 2021
 */

package za.ca.cput.Entity.Order;


public class CustomerInvoice {

    private long InvoiceDate;
    private double OrderAmount;


    public CustomerInvoice(Builder builder) {
        this.InvoiceDate = builder.InvoiceDate;
        this.OrderAmount = builder.OrderAmount;

    }

    public CustomerInvoice() {
        //Constructor for the CustomerInvoiceFactoryTest class
    }

    @Override
    public String toString() {
        return " CustomerInvoice{ " +
                " InvoiceDate = '" + InvoiceDate + '\'' +
                ", OrderAmount = '" + OrderAmount + '\'' +
                '}';
    }

    public static class Builder {
        private long InvoiceDate;
        private double OrderAmount;

        public CustomerInvoice.Builder setInvoiceDate(long InvoiceDate) {
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
