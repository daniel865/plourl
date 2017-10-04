public class Destination {

    private final Integer id;
    private final String state;
    private final String city;
    private final String address;
    private final User user;
    private final Double latitude;
    private final Double longitude;

    public Destination(Integer id, String state, String city, String address, User user, Double latitude, Double longitude) {
        this.id = id;
        this.state = state;
        this.city = city;
        this.address = address;
        this.user = user;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public User getUser() {
        return user;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
