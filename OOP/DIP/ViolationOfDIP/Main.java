package DIP.ViolationOfDIP;

public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.flip(true);  // Output: LightBulb is turned on
        lightSwitch.flip(false); // Output: LightBulb is turned off
    }
}
