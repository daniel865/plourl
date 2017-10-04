import java.util.Date;

public class Availability {

    private final Integer id;
    private final Date departure;
    private final Float height;
    private final Float width;
    private final Float depth;
    private final Destination destination;
    private final User driver;

    public Availability(Integer id, Date departure, Float height, Float width, Float depth, Destination destination, User driver) {
        this.id = id;
        this.departure = departure;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.destination = destination;
        this.driver = driver;
    }

    public Integer getId() {
        return id;
    }

    public Date getDeparture() {
        return departure;
    }

    public Float getHeight() {
        return height;
    }

    public Float getWidth() {
        return width;
    }

    public Float getDepth() {
        return depth;
    }

    public Destination getDestination() {
        return destination;
    }

    public User getDriver() {
        return driver;
    }
}
