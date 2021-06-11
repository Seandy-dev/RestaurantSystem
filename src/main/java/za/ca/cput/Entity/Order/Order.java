package za.ca.cput.Entity.Order;

/* Order.java
   Entity for Order
   Author : Devon Sherwyn May (219168296)
   Date : 08 June 2021
*/
public class Order
{
    private int OrderNumber;
    private Long OrderDate;

    private Order(Builder builder)
    {
        this.OrderNumber= builder.OrderNumber;
        this.OrderDate= builder.OrderDate;
    }

    @Override
    public String toString()
    {
        return "Builder{" +
                "OrderNumber=" + OrderNumber +
                ", OrderDate=" + OrderDate +
                '}';
    }

    public static class Builder
    {
        private int OrderNumber;
        private long OrderDate;

        public Builder setOrderNumber(int orderNumber)
        {
            this.OrderNumber = orderNumber;
            return this;
        }

        public Builder setOrderDate(long orderDate)
        {
            this.OrderDate = orderDate;
            return this;
        }

        public Order build()
        {
            return new Order(this);
        }

        private Builder copy(Order order)
        {
            this.OrderNumber = order.OrderNumber;
            this.OrderDate = order.OrderDate;
            return this;
        }
    }
}
