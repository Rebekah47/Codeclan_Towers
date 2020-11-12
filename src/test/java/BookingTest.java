import Hotel.Booking;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1,20, RoomType.SINGLE, 75.00);
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNumOfNights(){
        assertEquals(2, booking.getNumOfNights());
    }

    @Test
    public void canTotalPrice(){
        assertEquals(150.00, booking.getTotalPrice(), 0.01);
    }
}

