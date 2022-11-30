package Example;

import Example.cars.BugattiVeyron;
import Example.interfaces.Movable;
import Example.interfaces.MovableAdapter;
import Example.interfaces.MovableAdapterImpl;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        /**
         * Instantiating a movable object and a movable object adapter
         */
        Movable bugattiVeyron = new BugattiVeyron();

        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println("Bugatti Veyron's top speed in MPH: " + bugattiVeyron.getSpeed());
        System.out.println("Bugatti Veyron's  top speed in KMPH: " + bugattiVeyronAdapter.getSpeed());
    }
}