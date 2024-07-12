package DIP.AdherenceOfDIP;

public class Main {
    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.flip(true);
    }
}
