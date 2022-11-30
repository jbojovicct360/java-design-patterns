package design.pattern.models;

import design.pattern.mediator.Mediator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Button {
    private Fan fan;

    public void press(){
        if(fan.isOn()){
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

//    private Mediator mediator;
//
//    public void press() {
//        mediator.press();
//    }
}
