package example.strategies;

import example.interfaces.Discounter;

/**
 * Strategy number 1
 */
public class EasterDiscount implements Discounter {

    /**
     * @param amount Applies 20% discount to the provided amount
     * @return returns 20% discounted price
     */
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.8;
    }
}
