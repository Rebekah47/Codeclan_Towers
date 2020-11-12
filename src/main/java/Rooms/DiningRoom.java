package Rooms;

public class DiningRoom extends Room{

    private String name;

    public DiningRoom(int capacity, double price, String name) {
        super(capacity, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
