package Hotel;

import Rooms.Bedroom;

public class Booking {

    private Bedroom bedroom;
    private int numOfNights;

    public Booking(Bedroom bedroom, int numOfNights) {
        this.bedroom = bedroom;
        this.numOfNights = numOfNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public double getTotalPrice() {
        return this.bedroom.getPrice() * this.numOfNights;
    }
}
