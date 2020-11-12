import Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(100, 50, "Fancy Food");
    }

    @Test
    public void hasName(){
        assertEquals("Fancy Food", diningRoom.getName());
    }

}
