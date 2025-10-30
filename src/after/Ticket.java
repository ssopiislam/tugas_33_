package after;

public abstract class Ticket {
    private String name;
    private String destination;
    private int seatNumber;
    private double price;
    protected static final double TAX_RATE = 0.1;

    public Ticket(String name, String destination, int seatNumber, double price) {
        this.name = name;
        this.destination = destination;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getName() { return name; }
    public String getDestination() { return destination; }
    public int getSeatNumber() { return seatNumber; }
    public double getPrice() { return price; }

    public double calculateTotalPrice() {
        return price + (price * TAX_RATE);
    }

    public abstract void displayInfo();
}
