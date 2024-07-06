package Delegation.Example_1;

public class TicketBookingByAgent implements TravelBooking {

    private TravelBooking travelBooking;

    public TicketBookingByAgent(TravelBooking travelBooking) {
        this.travelBooking = travelBooking;
    }

    @Override
    public void bookTicket() {
        travelBooking.bookTicket();
    }
}
