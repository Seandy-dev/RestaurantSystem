package za.ca.cput.Factory;
import za.ca.cput.Entity.Order.Order;

/* OrderFactory.java
   Order Factory
   Author : Devon Sherwyn May (219168296)
   Date : 11 June 2021
*/

public class OrderFactory
{
    public  static Order createOrder(int orderNumber, long orderDate)
    {
        Order order = new Order.Builder()
                .setOrderNumber(orderNumber)
                .setOrderDate(orderDate)
                .build();
        return order;
    }
}
