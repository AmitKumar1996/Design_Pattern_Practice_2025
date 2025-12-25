package Accenture.dsajava;

public class Shipment {

    private String id;
    private String city;
    private int daysLeft;

    public Shipment(String id, String city, int daysLeft) {
        this.id = id;
        this.city = city;
        this.daysLeft = daysLeft;
    }

    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public String toString() {
        return id + " " + city + " " + daysLeft;
    }
}
