package Example;

import Example.cars.BugattiVeyron;
import Example.interfaces.Movable;
import Example.interfaces.MovableAdapter;
import Example.interfaces.MovableAdapterImpl;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        Movable bugattiVeyron = new BugattiVeyron();

        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println("Bugatti Veyron's top speed in MPH: " + bugattiVeyron.getSpeed());
        System.out.println("Bugatti Veyron's  top speed in KMPH: " + bugattiVeyronAdapter.getSpeed());
    }
}