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
        double total = price + (price * 0.1); // total harga + pajak 10%
        double discount = 0;

        // Fitur baru: diskon 5% kalau total lebih dari 2 juta
        if (total > 2000000) {
            discount = total * 0.05;
            total -= discount;
            System.out.println("🎉 Anda mendapatkan diskon 5% sebesar Rp " + discount);
        }

        System.out.println("=== Ticket Information ===");
        System.out.println("Name: " + name);
        System.out.println("Destination: " + destination);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Total Price (after tax & discount): Rp " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter destination: ");
        String d = sc.nextLine();
        System.out.print("Enter seat number: ");
        int s = sc.nextInt();
        System.out.print("Enter price: Rp ");
        double p = sc.nextDouble();

        ticketBookingPlane tb = new ticketBookingPlane(n, d, s, p);
        tb.showTicketInfo();
    }
}
