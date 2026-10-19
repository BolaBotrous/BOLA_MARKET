
package BOLA_MARKET;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<CartItem>items;
    private double totalAmount;
    private PaymentMethod paymentMethod;

    public Order(int orderId, ArrayList<CartItem> items, double totalAmount, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
    }

    public void placeOrder()
    {
        boolean paid= paymentMethod.pay(totalAmount);
        try
        {
            if(paid)
            {
                System.out.println("YOUR ORDER HAS BEEN PLACED WITH TOTAL : "+totalAmount+" $");
            }
            else {
                throw new NotEnoughCashException("SORRY...NOT ENOUGH CASH");

            }
        }
        catch (NotEnoughCashException e)
        {
            System.out.println(e.getMessage());
        }


    }
}


