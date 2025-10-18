import java.util.*;

public class SupportSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Ticket> tickets = new LinkedList<>();
        int maxTickets = 3; // Declare this since ayaw ko po i-type na out of 3 lang haha
        String name;
        String issue; // Declare name and issue reset in for-loop

        System.out.println( "Welcome to the IT Support Ticket System!\n");
        System.out.println( "---Enter Ticket Details---");

        for (int i = 1; i <= maxTickets; i++) {
            System.out.println("Please enter the details for ticket " + i + " of " + maxTickets + ".");
            System.out.print("Please enter your name: ");
            name = sc.nextLine();
            System.out.print("Describe your issue: ");
            issue = sc.nextLine();
            System.out.println(); // Add lang ng new space
            tickets.add(new Ticket(name, issue));
        }
        System.out.println("-------------------------------------------\n" +
                "All tickets have been logged.\n" +
                "There are 3 tickets waiting in the queue.\n" +
                "-------------------------------------------\n");

        sc.close(); // Close para walang leak parang gripo lang

        System.out.println("--- Processing Tickets ---");
        for (int i = 1; i < 2; i++) {
            System.out.println("Resolving: " + tickets.peek());
            tickets.remove();
            System.out.println("Resolving: " + tickets.peek());
            tickets.remove();
        }
        System.out.println("-------------------------------------------\n");

        System.out.println("All done for now.");
        System.out.println("Remaining tickets in queue: " + tickets.peek());
    }
}