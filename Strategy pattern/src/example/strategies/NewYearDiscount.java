package example.strategies;

import example.interfaces.Discounter;

/**
 * Strategy number 2
 */
public class NewYearDiscount implements Discounter {

    /**
     * @param amount Applies 40% discount to the provided amount
     * @return returns 40% discounted price
     */
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.6;
    }
}
