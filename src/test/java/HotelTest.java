import Guests.Guest;
import Hotel.Hotel;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

   private Hotel hotel;
   private Guest guest1;
   private Guest guest2;
   private Bedroom bedroom;
   private ConferenceRoom conferenceRoom;
   private ArrayList<Guest> party;


    @Before
    public void before(){
        hotel = new Hotel();
        guest1 = new Guest("Phil");
        guest2 = new Guest("Steve");
        conferenceRoom = new ConferenceRoom(300, "Donald Suite", 50);
        bedroom = new Bedroom(1, 30, RoomType.SINGLE);
        party = new ArrayList<Guest>();
        party.add(guest1);


    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomList());

    }

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomList());

    }


    @Test
    public void canCheckGuestInBedroom(){
        hotel.checkInGuestBedroom(party, bedroom);
        assertEquals(true, bedroom.getOccupiedStatus());
    }

    @Test
    public void canCheckGuestInConferenceRoom(){
        hotel.checkInGuestConferenceRoom(guest2, conferenceRoom);
        assertEquals(1, conferenceRoom.getNumberGuests());
    }

    @Test
    public void canCheckGuestOutBedroom(){
        hotel.checkInGuestBedroom(party, bedroom);
        hotel.checkOutGuestBedroom(bedroom);
        assertEquals(false, bedroom.getOccupiedStatus());
    }

    @Test
    public void canCheckGuestOutConferenceRoom(){
        hotel.checkInGuestConferenceRoom(guest2, conferenceRoom);
        hotel.checkOutGuestConferenceRoom(conferenceRoom);
        assertEquals(0, conferenceRoom.getNumberGuests());
    }




}
