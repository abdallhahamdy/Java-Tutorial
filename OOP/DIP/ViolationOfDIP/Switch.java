package DIP.ViolationOfDIP;

class Switch {
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void flip(boolean on) {
        if (on) {
            lightBulb.turnOn();
        } else {
            lightBulb.turnOff();
        }
    }
}