public class Ticket extends Passenger {
    private int flightNumber;
    private int seatNumber;

    public Ticket(int id, String gen, String fN, String lN, int cN){
        super(id, gen, fN, lN, cN);
    }

    public Ticket (int flNum, int stNo) {
        this.flightNumber = flNum;
        this.seatNumber = stNo;
    }
    public Ticket(int id, String gen, String fN, String lN, int cN, int flNum, int stNo) {
        super(id, gen, fN, lN, cN);
        this.flightNumber = flNum;
        this.seatNumber = stNo;

    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ticket otherTicket = (Ticket) obj;


        boolean ticketComparison = seatNumber == otherTicket.seatNumber && flightNumber == otherTicket.flightNumber;


        boolean passengerComparison = super.equals(obj);


        return ticketComparison || passengerComparison;
    }
}
