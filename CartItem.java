
package BOLA_MARKET;

public class CartItem {
    private Product product;
    private int quantity;

    public double getItemPrice()
    {
        return product.getProductPrice()*quantity;
    }

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}


