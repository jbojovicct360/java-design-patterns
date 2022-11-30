package design.pattern.mediator;

import design.pattern.models.Button;
import design.pattern.models.Fan;
import design.pattern.models.PowerSupplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }

}
