package za.ca.cput.Entity.Order;
/* OrderItem.java
   Entity for OrderItem
   Author : Devon Sherwyn May (219168296)
   Date : 07 June 2021
 */
public class OrderItem
{
    private int Quantity;

    private OrderItem(Builder builder)
    {
        this.Quantity= builder.Quantity;
    }

    @Override
    public String toString()
    {
        return "OrderItem{" +
                "Quantity=" + Quantity +
                '}';
    }

    public static class Builder
    {
        private int Quantity;

        public Builder setQuantity(int quantity)
        {
            this.Quantity = quantity;
            return this;
        }

        public OrderItem build()
        {
            return new OrderItem(this);
        }

        private Builder copy(OrderItem orderitem)
        {
            this.Quantity = orderitem.Quantity;
            return this;
        }

    }
}
