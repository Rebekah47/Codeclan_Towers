import Guests.Guest;
import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(300, "Donald Suite", 50);
        guest = new Guest("Phil");
    }

    @Test
    public void hasCapacity(){
        assertEquals(300, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Donald Suite", conferenceRoom.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(50, conferenceRoom.getPrice());
    }
}
