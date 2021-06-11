package za.ca.cput.Factory;
import za.ca.cput.Entity.Order.OrderItem;
/* OrderItemFactory.java
   OrderItem Factory
   Author : Devon Sherwyn May (219168296)
   Date : 11 June 2021
*/
public class OrderItemFactory
{
    public  static OrderItem createOrderItem(int quantity)
    {

        OrderItem orderItem = new OrderItem.Builder()
                .setQuantity(quantity)
                .build();
        return orderItem;
    }
}
