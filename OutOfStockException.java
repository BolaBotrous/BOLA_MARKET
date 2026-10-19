package BOLA_MARKET;

public class OutOfStockException extends Exception{
    OutOfStockException(String msg)
    {
        super(msg);
    }
}
