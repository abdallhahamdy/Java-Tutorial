package DIP.AdherenceOfDIP;

public class Switch {
    private Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void flip(boolean on) {
        if (on) {
            switchable.turnOn();
        } else {
            switchable.turnOff();
        }
    }
}
