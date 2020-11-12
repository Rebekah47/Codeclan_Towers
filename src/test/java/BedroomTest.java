import Guests.Guest;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1,30, RoomType.SINGLE, 75.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(30, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }


}
