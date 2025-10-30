package after;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        FlightTicket ticket = new FlightTicket(name, destination, seat, price);
        ticket.displayInfo();
    }
}

