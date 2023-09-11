import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {
    private int flightNumber;
    private int noSeats;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    private String departurePlace;
    private String destination;

    public Flight(LocalDateTime departureTime, LocalDateTime arrivalTime, String departurePlace, String destination) {

        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.destination = destination;
        this.departurePlace = departurePlace;
    }

    public Flight(int flightNumber, int noSeats, LocalDateTime departureTime, LocalDateTime arrivalTime, String departurePlace, String destination) {
        this.flightNumber = flightNumber;
        this.noSeats = noSeats;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.destination = destination;
        this.departurePlace = departurePlace;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public String getDestination() {
        return destination;
    }


    public boolean equals(Flight obj) {
        boolean result;
        if (this.arrivalTime == obj.arrivalTime && this.departureTime == obj.departureTime &&
                Objects.equals(this.destination, obj.destination) && Objects.equals(this.departurePlace, obj.departurePlace)) {
                obj.flightNumber = this.flightNumber;
                obj.noSeats = this.noSeats;
                result = true; // Same object reference, so they are equal
        } else
        if (getClass() != obj.getClass()) {
            result = false; // Different classes or null, so not equal
        }
        else {
            result = false;
        }

        return result;
    }

    /*
    @Override
     public String toString() {
        return
                "Flight Number: " + flightNumber +
                ", Number Of Seats: " + noSeats +
                ", Departure Time: " + departureTime +
                ", Arrival Time: " + arrivalTime +
                ", Departure Place: '" + departurePlace + '\'' +
                ", Destination: '" + destination + '\'';
    } */
}
