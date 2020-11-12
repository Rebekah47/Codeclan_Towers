import Guests.Guest;
import Hotel.Hotel;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest1;
    Guest guest2;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;


    @Before
    public void before(){
        hotel = new Hotel();
        guest1 = new Guest("Phil");
        guest2 = new Guest("Steve");
        conferenceRoom = new ConferenceRoom(300, "Donald Suite", 50);
        bedroom = new Bedroom(1, 30, RoomType.SINGLE);

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
        hotel.checkInGuestBedroom(guest1, bedroom);
        assertEquals(true, bedroom.getOccupiedStatusBedrooom());
    }

    @Test
    public void canCheckGuestInConferenceRoom(){
        hotel.checkInGuestConferenceRoom(guest2, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuests());
    }

    @Test
    public void canCheckGuestOutBedroom(){
        hotel.checkInGuest(guest1, bedroom);
        hotel.checkOutGuest(guest1, bedroom);
        assertEquals(false, bedroom.getOccupiedStatusBedrooom());
    }

    @Test
    public void canCheckGuestOutConferenceRoom(){
        hotel.checkInGuest(guest2, conferenceRoom);
        hotel.checkOutGuest(guest2, conferenceRoom);
        assertEquals(1, conferenceRoom.getGuests());
    }




}
