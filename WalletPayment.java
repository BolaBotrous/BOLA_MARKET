    package BOLA_MARKET;

    public class WalletPayment extends PaymentMethod{

        private double cash;

        public WalletPayment(double cash) {
            this.cash = cash;
        }



        @Override
        public boolean pay(double totalAmount) {
            if(totalAmount<=cash)
            {
                cash-=totalAmount;
                return true;
            }
            else
            {
                return false;
            }
        }
    }
