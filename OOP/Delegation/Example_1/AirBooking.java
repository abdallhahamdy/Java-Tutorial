package Delegation.Example_1;

public class AirBooking implements TravelBooking {
    @Override
    public void bookTicket() {
        System.out.println("Flight ticket booked");
    }
}
