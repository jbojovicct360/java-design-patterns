package Example.cars;

import Example.interfaces.Movable;

/**
 * Concrete implementation of Movable interface
 */
public class BugattiVeyron implements Movable {

    @Override
    public double getSpeed() {
        return 268;
    }
}
