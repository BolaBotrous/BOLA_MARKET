package BOLA_MARKET;

public class CreditCard {
    private String holderName;
    private double cash;

    public CreditCard(String holderName, double cash) {
        this.holderName = holderName;
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public void reduceCash(double amount) {
        this.cash -=amount;
    }
}
