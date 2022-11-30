package Example.interfaces;

/**
 * Movable adapter implementation
 */
public class MovableAdapterImpl implements MovableAdapter {

    /**
     * Movable object that is going to be adapted
     */
    private Movable luxuryCar;

    public MovableAdapterImpl(Movable luxuryCar) {
        this.luxuryCar = luxuryCar;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCar.getSpeed());
    }

    /**
     * Converts speed from MPH to KMPH
     * @param mph speed that is going to be converted to KMPH
     * @return speed in KMPH
     */
    private double convertMPHtoKMPH(double mph){
        return mph * 1.60934;
    }
}
