package design.pattern.models;

import design.pattern.mediator.Mediator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fan {
    private Button button;
    private PowerSupplier powerSupplier;
    private boolean isOn = false;

    public void turnOn() {
        powerSupplier.turnOn();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        powerSupplier.turnOff();
    }

//    private Mediator mediator;
//    private boolean isOn = false;
//
//    public void turnOn() {
//        mediator.start();
//        isOn = true;
//    }
//
//    public void turnOff() {
//        isOn = false;
//        mediator.stop();
//    }
}