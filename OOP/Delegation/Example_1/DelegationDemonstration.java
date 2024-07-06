package Delegation.Example_1;

public class DelegationDemonstration {
    public static void main(String[] args) {
        TicketBookingByAgent agent = new TicketBookingByAgent(new TrainBooking());
        agent.bookTicket();  // Output: Train ticket booked

        agent = new TicketBookingByAgent(new AirBooking());
        agent.bookTicket();   // Output: Flight ticket booked
    }
}
