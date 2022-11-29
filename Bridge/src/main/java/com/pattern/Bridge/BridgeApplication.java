package com.pattern.Bridge;

import com.pattern.Bridge.devices.Device;
import com.pattern.Bridge.devices.Radio;
import com.pattern.Bridge.devices.Tv;
import com.pattern.Bridge.remotes.AdvancedRemote;
import com.pattern.Bridge.remotes.BasicRemote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BridgeApplication.class, args);

		testDevice(new Tv());
		testDevice(new Radio());
	}

	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}

}
