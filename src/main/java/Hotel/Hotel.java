package Hotel;

import Guests.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom>bedrooms;
    private ArrayList<ConferenceRoom>conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getBedroomList() {
        return this.bedrooms.size();
    }

    public int getConferenceRoomList(){
        return this.conferenceRooms.size();
    }

    public void checkInGuestBedroom(ArrayList<Guest> party, Bedroom bedroom) {
        if (bedroom.getOccupiedStatus() == false){
            if (party.size() <= bedroom.getCapacity()){
                for (Guest guest : party){
                    bedroom.addGuests(guest);
                }
                bedroom.checkIn();
            }
        }
        // if the room is occupied (boolean)
        //      if the party size is less than the room capacity
                    // for loop (add party to guest list)
                // changed occupied with bedroom method to true
    }

    public void checkInGuestConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        if (conferenceRoom.getNumberGuests() < conferenceRoom.getCapacity() ){
            conferenceRoom.addGuests(guest);
        }
    }

    public void checkOutGuestBedroom( Bedroom bedroom) {
        bedroom.clearGuests();
        bedroom.checkOut();
    }

    public void checkOutGuestConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.clearGuests();
    }
}
