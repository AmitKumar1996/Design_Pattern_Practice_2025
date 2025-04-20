package Static;

public class ConcertTicketBookingApp {

    // Ticket Booking System class
    static class TicketBookingSystem {
        private int availableTickets;

        public TicketBookingSystem(int totalTickets) {
            this.availableTickets = totalTickets;
        }

        // Synchronized method to book tickets
        public synchronized boolean bookTickets(int requestedTickets) {
            if (requestedTickets <= availableTickets) {
                availableTickets -= requestedTickets;
                System.out.println(requestedTickets + " tickets booked successfully. Tickets left: " + availableTickets);
                return true;
            } else {
                System.out.println("Not enough tickets available. Requested: " + requestedTickets + ", Available: " + availableTickets);
                return false;
            }
        }

        public int getAvailableTickets() {
            return availableTickets;
        }
    }

    // BookingRequest class that simulates booking threads
    static class BookingRequest extends Thread {
        private TicketBookingSystem ticketBookingSystem;
        private int requestedTickets;

        public BookingRequest(TicketBookingSystem ticketBookingSystem, int requestedTickets) {
            this.ticketBookingSystem = ticketBookingSystem;
            this.requestedTickets = requestedTickets;
        }

        @Override
        public void run() {
            // Simulating a user requesting to book tickets
            ticketBookingSystem.bookTickets(requestedTickets);
        }
    }

    // Main method to simulate the ticket booking system
    public static void main(String[] args) {
        // Create the ticket booking system with a total of 10 tickets
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(10);

        // Simulate multiple users attempting to book tickets
        Thread user1 = new BookingRequest(ticketBookingSystem, 3);  // User 1 requests 3 tickets
        Thread user2 = new BookingRequest(ticketBookingSystem, 5);  // User 2 requests 5 tickets
        Thread user3 = new BookingRequest(ticketBookingSystem, 4);  // User 3 requests 4 tickets
        Thread user4 = new BookingRequest(ticketBookingSystem, 2);  // User 4 requests 2 tickets

        // Start all threads (simulating concurrent booking requests)
        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}

