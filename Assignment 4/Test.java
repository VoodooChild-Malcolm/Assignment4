import java.time.LocalDateTime;
import java.time.format.*;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
      /*  MyLinkedList<Ticket> Tickets = new MyLinkedList<>();
        MyLinkedList<Flight> Flights =  new MyLinkedList<>();

        Flights.append(new Flight(2001, 120, parseDateTime("2021-01-12 12:30:00"),
                parseDateTime("2021-01-13 00:30:00"), "Heathrow", "Johannesburg"));
        Flights.append(new Flight(2011, 100, parseDateTime("2021-01-12 12:30:00"),
                parseDateTime("2021-01-13 00:30:00"), "London", "Cape Town"));
        Flights.append(new Flight(2002, 110, parseDateTime("2021-01-12 12:30:00"),
                parseDateTime("2021-01-13 00:30:00"), "Paris", "Heathrow"));
        Flights.append(new Flight(2019, 100, parseDateTime("2021-01-12 12:30:00"),
                parseDateTime("2021-01-13 00:30:00"), "Cape Town", "Johannesburg"));
        Flights.append(new Flight(2030, 125, parseDateTime("2021-01-12 12:30:00"),
                parseDateTime("2021-01-13 00:30:00"), "Lagos", "Kiev"));
        Flights.append(new Flight(2102, 145, parseDateTime("2021-01-12 12:30:00"),
                parseDateTime("2021-01-13 00:30:00"), "Sydney", "Kuala Lumpur")); */


        //Flights.toString();
        //reserveTicket(Tickets, Flights);



    }



    private static void reserveTicket(MyLinkedList<Ticket> Tickets, MyLinkedList<Flight> Flights){


        boolean cond = true;

        //Display current flights list

        while (cond){

            Scanner scanner = new Scanner(System.in);

            // Input for destination
            System.out.print("Enter destination: ");
            String destination = scanner.nextLine();

            // Input for departure place
            System.out.print("Enter departure place: ");
            String departurePlace = scanner.nextLine();

            // Input for arrival time
            System.out.print("Enter arrival time (yyyy-MM-dd HH:mm:ss): ");
            String arrivalTimeString = scanner.nextLine();
            LocalDateTime arrivalTime = parseDateTime(arrivalTimeString);

            // Input for departure time
            System.out.print("Enter departure time (yyyy-MM-dd HH:mm:ss): ");
            String departureTimeString = scanner.nextLine();
            LocalDateTime departureTime = parseDateTime(departureTimeString);

            Flight inputFlight = new Flight(departureTime, arrivalTime, departurePlace,destination);
            if (Flights.contains(inputFlight)) {
                System.out.print("Would you like to reserve Flight? (Y/N)");
                String reservationChoice = scanner.nextLine().toUpperCase();


                if (reservationChoice.equals("Y")) {
                    // Input for idNumber
                    System.out.print("Enter ID Number: ");
                    int idNumber = scanner.nextInt();

                    // Input for gender
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();

                    // Input for firstName
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();

                    // Input for lastName
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();

                    // Input for contactNumber
                    System.out.print("Enter Contact Number: ");
                    int contactNumber = scanner.nextInt();

                    Ticket newTicket = new Ticket(idNumber, gender, firstName, lastName, contactNumber,
                            inputFlight.getFlightNumber(), inputFlight.getNoSeats());
                    Tickets.append(newTicket);
                } else {
                    cond = false;
                }
            } else {
                System.out.print("Please select flight from provided list.");
            }

        }

    }

    public static void cancelTicket(MyLinkedList<Ticket> Tickets) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Delete By: \n 1. Personal Details  \n 2. Ticket Details");
        int select = scanner.nextInt();

        switch (select) {
            case 1: {
                // Input for idNumber
                System.out.print("Enter ID Number: ");
                int idNumber = scanner.nextInt();

                // Input for gender
                System.out.print("Enter Gender: ");
                String gender = scanner.nextLine();

                // Input for firstName
                System.out.print("Enter First Name: ");
                String firstName = scanner.nextLine();

                // Input for lastName
                System.out.print("Enter Last Name: ");
                String lastName = scanner.nextLine();

                // Input for contactNumber
                System.out.print("Enter Contact Number: ");
                int contactNumber = scanner.nextInt();

                Ticket p1 = new Ticket(idNumber, gender, firstName, lastName, contactNumber );

                if (Tickets.contains(p1)) {
                    Tickets.removeCurrent(p1);
                }
            }
            case 2: {
                System.out.print("Enter Ticket Number: ");
                int ticketNo = scanner.nextInt();

                System.out.print("Enter Seat Number: ");
                int seatNo = scanner.nextInt();

                Ticket p1 = new Ticket(ticketNo, seatNo);
                if (Tickets.contains(p1)) {
                    Tickets.removeCurrent(p1);
                }
            }
        }








    }

    public static void checkTicket(MyLinkedList<Ticket> Tickets) {
        Scanner scanner = new Scanner(System.in);

        // Input for idNumber
        System.out.print("Enter ID Number: ");
        int idNumber = scanner.nextInt();

        // Input for gender
        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        // Input for firstName
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        // Input for lastName
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // Input for contactNumber
        System.out.print("Enter Contact Number: ");
        int contactNumber = scanner.nextInt();

        Ticket p1 = new Ticket(idNumber, gender, firstName, lastName, contactNumber );

        if (Tickets.contains(p1)) {
            System.out.print("Ticket exists");
        }
    }


    //Functions of Formatting Convenience
    private static LocalDateTime parseDateTime(String dateTimeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(dateTimeString, formatter);
    }


}
