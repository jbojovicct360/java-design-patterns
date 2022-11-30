package example.strategies;

import example.interfaces.Discounter;

/**
 * Strategy number 3
 */
public class ChristmasDiscount implements Discounter {

    /**
     * @param amount Applies 60% discount to the provided amount
     * @return returns 60% discounted price
     */
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.4;
    }
}
