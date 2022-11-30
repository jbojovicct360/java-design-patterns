package example.interfaces;

/**
 * Common interface, used to select the strategy that is to be applied at runtime
 */
public interface Discounter {

    /**
     * Method that applies desired strategies discount
     * @param amount amount of money that a product on which the discount is applied costs
     * @return returns the discounted price, that varies depending on the strategy
     */
    double applyDiscount(double amount);
}
