package BOLA_MARKET;

public class CashOnDelivery extends PaymentMethod {
    @Override
    public boolean pay(double totalAmount) {
        return true;
    }
}
