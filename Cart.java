
package BOLA_MARKET;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem>items=new ArrayList<>();

    public void addItem(Product p,int quantity )
    {
        CartItem ct =new CartItem(p,quantity);

        try{
            if(p.getStock()>=quantity)
            {
                items.add(ct);
                p.reduceStock(quantity);
            }
            else {
                throw new OutOfStockException("THERE IS ONLY "+ p.getStock()+" IN THE STOCK");
            }
        }
        catch (OutOfStockException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void removeItem(CartItem ct)
    {
        items.remove(ct);
    }

    public double getTotalPrice()
    {
        double p=0;
        if(items!=null) {
            for (int i = 0; i < items.size(); i++) {
                p += items.get(i).getItemPrice();
            }
        }
        return p;

    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void showItems()
    {
        for(int i=0;i<items.size();i++)
        {
            System.out.println((i+1)+"."+ items.get(i).getProduct().getName()+" QUANTITY: " + items.get(i).getQuantity());

        }
        System.out.println("THE TOTAL PRICE IS: " + getTotalPrice()+"$");
        System.out.println();
    }

    public void resetItems() {
        this.items.clear();
    }
}


