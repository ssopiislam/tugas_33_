package after;

public class FlightTicket extends Ticket implements Bookable {

    public FlightTicket(String name, String destination, int seatNumber, double price) {
        super(name, destination, seatNumber, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== Flight Ticket Info ===");
        System.out.println("Name: " + getName());
        System.out.println("Destination: " + getDestination());
        System.out.println("Seat Number: " + getSeatNumber());
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}