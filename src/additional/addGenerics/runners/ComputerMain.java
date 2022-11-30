package additional.addGenerics.runners;

import additional.addGenerics.computer.*;

public class ComputerMain {
    public static void main(String[] args) {
        final Computer comp = new Computer(new CPU(),new DDR(),new HDD(),new PowerUnit(),new VideoCard(),new Motherboard());
        comp.PowerOn();
        System.out.println(comp.PowerOn());
        System.out.println("компьютер включен");
        comp.PowerOFF();
        System.out.println(comp.PowerOFF());
        System.out.println("компьютер выключен");
    }
}
