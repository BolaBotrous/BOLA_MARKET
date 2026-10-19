package BOLA_MARKET;

public class User {
    private String name;
    private Cart cart;

    public User(String name, Cart cart) {
        this.name = name;
        this.cart = cart;


    }

    public void addToCart(Product p, int quantity) {
      if(p.getStock()<quantity)
      {
          System.out.println(p.getName()+" IS OUT OF STOCK...THERE IS ONLY "+p.getStock()+" LEFT");
      }
      else
      {
          cart.addItem(p,quantity);
      }

    }

    public void removeFromCart(CartItem ct)
    {
        cart.removeItem(ct);
    }


    public String getName() {
        return name;
    }
}




