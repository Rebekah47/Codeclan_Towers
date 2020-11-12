package Rooms;

public class Bedroom extends Room{
    private int roomNumber;
    private RoomType roomType;
    private Boolean occupied;

    public Bedroom(int capacity, int roomNumber, RoomType roomType ) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = false;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Boolean getOccupiedStatus(){
        return this.occupied;
    }

    public void checkIn(){
        this.occupied = true;
    }

    public void checkOut(){
        this.occupied = false;
    }

}
