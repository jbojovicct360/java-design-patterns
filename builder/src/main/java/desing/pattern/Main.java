package desing.pattern;

import desing.pattern.models.Computer;
import desing.pattern.models.ComputerLombok;

public class Main {
    public static void main(String[] args) {


        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                                    .setBluetoothEnabled(false)
                                    .setGraphicsCardEnabled(false)
                                    .build();

        System.out.println(computer);




        ComputerLombok computerLombok = ComputerLombok.builder()
                                    .HDD("1 TB")
                                    .RAM("16 GB")
                                    .isBluetoothEnabled(true)
                                    .isGraphicsCardEnabled(true)
                                    .build();
        System.out.println(computerLombok);
    }
}