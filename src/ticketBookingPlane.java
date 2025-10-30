import java.util.Scanner;

public class ticketBookingPlane implements ticketBookingPlanee {
    public String name;
    public String destination;
    public int seatNumber;
    public double price;


    public ticketBookingPlane(String n, String d, int s, double p) {
        name = n;
        destination = d;
        seatNumber = s;
        price = p;
    }

    public void showTicketInfo() {
        System.out.println("=== Ticket Information ===");
        System.out.println("Name: " + name);
        System.out.println("Destination: " + destination);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Total Price: " + (price + (price * 0.1)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter destination: ");
        String d = sc.nextLine();
        System.out.print("Enter seat number: ");
        int s = sc.nextInt();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();

        ticketBookingPlane tb = new ticketBookingPlane(n, d, s, p);
        tb.showTicketInfo();

    }

}