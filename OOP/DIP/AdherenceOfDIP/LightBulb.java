package DIP.AdherenceOfDIP;

public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("LightBulb is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is turned off");
    }
}
