package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addGuests(Guest guest) {
        this.guests.add(guest);
    }

    public void clearGuests() {
        this.guests = new ArrayList<Guest>();
    }

    public int getNumberGuests(){
        return this.guests.size();
    }
}
