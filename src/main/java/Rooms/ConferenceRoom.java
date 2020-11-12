package Rooms;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(int capacity, String name, int price) {
        super(capacity, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
