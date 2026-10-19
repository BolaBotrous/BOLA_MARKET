
package BOLA_MARKET;

public class CreditCardPayment extends PaymentMethod {
    private CreditCard cc;

    public CreditCardPayment(CreditCard cc) {
        this.cc = cc;
    }

    @Override
    public boolean pay(double totalAmount) {
        if(totalAmount <=cc.getCash())
        {
            cc.reduceCash(totalAmount);
            return true;
        }
        else
        {
            return false;
        }
    }
}


