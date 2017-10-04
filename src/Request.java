import java.util.Collection;
import java.util.Date;

public class Request {

    private final Integer id;
    private final User user;
    private final Date departure;
    private final Destination destination;
    private final Collection<Package> packages;

    public Request(Integer id, User user, Date departure, Destination destination, Collection<Package> packages) {
        this.id = id;
        this.user = user;
        this.departure = departure;
        this.destination = destination;
        this.packages = packages;
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Date getDeparture() {
        return departure;
    }

    public Destination getDestination() {
        return destination;
    }

    public Collection<Package> getPackages() {
        return packages;
    }
}
