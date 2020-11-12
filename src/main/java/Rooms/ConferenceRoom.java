package Rooms;

public class ConferenceRoom extends Room {

    private String name;
    private int price;

    public ConferenceRoom(int capacity, String name, int price) {
        super(capacity);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
